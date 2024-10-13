package com.morgan.usuarios.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("whisper")
public interface WhisperFeingClient {

    @GetMapping("/test")
    public ResponseEntity<String> test();
}
