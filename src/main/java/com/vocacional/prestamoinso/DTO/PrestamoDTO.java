package com.vocacional.prestamoinso.DTO;


import lombok.Data;

import java.util.List;

@Data
public class PrestamoDTO {
    private Long id;
        private String nroDocumento;
        private ClienteDTO cliente;
        private double monto;
        private int plazo;
        private double interes;
        private List<CronogramaPagosDTO> cronogramaPagos;
    }