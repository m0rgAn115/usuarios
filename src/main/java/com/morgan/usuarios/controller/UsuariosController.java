package com.morgan.usuarios.controller;

import com.morgan.usuarios.models.Cuenta;
import com.morgan.usuarios.models.Usuario;
import com.morgan.usuarios.service.IUsuariosService;
import com.morgan.usuarios.service.client.CuentaFeingClient;
import com.morgan.usuarios.service.client.WhisperFeingClient;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class UsuariosController {

    IUsuariosService usuarioService;
    CuentaFeingClient cuentaFeingClient;
    WhisperFeingClient whisperFeingClient;

    @PostMapping("/crear")
    public ResponseEntity<Usuario> createAccount(@Valid @RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usuario);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Usuario> getAccount(@PathVariable("id") Long idUsuario) {
        Usuario usuario = usuarioService.getUsuarioPorId(idUsuario);

        return ResponseEntity.ok(usuario);
    }
}
