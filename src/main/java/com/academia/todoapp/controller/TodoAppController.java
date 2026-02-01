package com.academia.todoapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/todoapp")
public class TodoAppController {

   @GetMapping("/hola")
    public String decirHola() {
        return "Hola Mundo";
    }

    @GetMapping("/greeting")
    public String saludoPersonalizado() {
        return "¡Bienvenido al demo todoapp!";
    }

    @GetMapping("/todos")
    public ResponseEntity<Object> list() {
        return ResponseEntity.ok(new String[]{
            "Comprar café",
            "Revisar pipelines",
            "Deploy a GKE"
        });
    }
}