package com.morgan.usuarios.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
    private Long id;

    private Long idUsuario;

    private String nombre;

    private String clabe;

    private String numero_cuenta;
    private String alias;
    private String tipo;
    private boolean estatus;

}
