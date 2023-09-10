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
public class Usuario extends BaseEntidad {
    private String nombre;
    private String password;
    private String rol;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "usuario_id")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido ped) {
        pedidos.add(ped);
    }
}
//https://github.com/Aguslo12/EjercicioBD.git