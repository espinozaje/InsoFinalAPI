package com.vocacional.prestamoinso.Repository;

import com.vocacional.prestamoinso.Entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo,Long> {
    List<Prestamo> findByCliente_NroDocumento(String dni);

    @Query("SELECT SUM(p.monto) FROM Prestamo p WHERE p.cliente.id = :clienteId AND " +
            "EXTRACT(YEAR FROM p.fechaCreacion) = :anio AND EXTRACT(MONTH FROM p.fechaCreacion) = :mes AND p.cronogramaPagos IS NOT EMPTY")
    Double obtenerTotalPrestamosMensuales(@Param("clienteId") Long clienteId, @Param("anio") int anio, @Param("mes") int mes);
}
