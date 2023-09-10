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
public class ConfiguracionGeneral extends BaseEntidad {
    private int cantidaCocineros;
    private String emailEmpresa;
    private String tokenMercadoPago;
}
