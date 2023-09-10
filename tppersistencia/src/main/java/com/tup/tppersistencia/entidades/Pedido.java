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
public class Pedido extends BaseEntidad {
    private String fecha;
    private Estado estado;
    private String horaEstimadaEntrega;
    private TipoEnvio tipoEnvio;
    private double total;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "factura_id")
    private Factura factura;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "pedido_id")
    @Builder.Default
    private List<DetallePedido> detallesPedidos = new ArrayList<>();

    public void agregarDetallePedido(DetallePedido det) {
        detallesPedidos.add(det);
    }

    public enum Estado {
        INICIADO,
        PREPARACION,
        ENTREGADO
    }

    public enum TipoEnvio {
        DELIVERY,
        RETIRA
    }
}
