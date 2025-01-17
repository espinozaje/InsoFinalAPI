package com.vocacional.prestamoinso.Repository;

import com.vocacional.prestamoinso.Entity.CronogramaPagos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CronogramaPagosRepository extends JpaRepository<CronogramaPagos,Long> {

    List<CronogramaPagos> findByPrestamoIdAndEstadoOrderByFechaPagoAsc(Long prestamoId, String estado);
    List<CronogramaPagos> findByPrestamoId(Long id);
}
