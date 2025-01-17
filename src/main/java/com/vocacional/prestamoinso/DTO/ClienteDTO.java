package com.vocacional.prestamoinso.DTO;

import com.vocacional.prestamoinso.Entity.enums.ERole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClienteDTO {

    private LocalDateTime createAt;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nroDocumento;
    private String tipoPersona;
    private String nacionalidad;
    private ERole role;
    private String estado;
    private String condicion;
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;

}
