package org.test.mtlsserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1/engine")
public class EngineController {
    @PostMapping("/start")
    public ResponseEntity<String> startEngine() {
        return ResponseEntity.ok().body("Engine running!");
    }
}
