package com.tup.tppersistencia.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura extends BaseEntidad {
    private String fecha;
    private int numero;
    private double descuento;
    private FormaPago formaPago;
    private int total;

    public enum FormaPago {
        EFECTIVO,
        CREDITO,
        DEBITO,
        MERCADO_PAGO
    }
}

