package com.tup.tppersistencia.repositorios;

import com.tup.tppersistencia.entidades.ConfiguracionGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionGeneralRepository extends JpaRepository<ConfiguracionGeneral, Long> {
}
