package com.morgan.usuarios.service.client;

import com.morgan.usuarios.models.Cuenta;
import com.morgan.usuarios.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("cuentas")
public interface CuentaFeingClient {

    @GetMapping("/api/get/{id}")
    public ResponseEntity<Cuenta> getAccount(@PathVariable("id") Long id);
}
