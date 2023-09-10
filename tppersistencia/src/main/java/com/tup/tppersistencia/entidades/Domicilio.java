package com.tup.tppersistencia.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends BaseEntidad {
    private String calle;
    private String numero;
    private String localidad;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido ped) {
        pedidos.add(ped);
    }

    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
