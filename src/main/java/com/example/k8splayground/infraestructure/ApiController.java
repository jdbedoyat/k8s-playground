package com.example.k8splayground.infraestructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/deployment")
    public ResponseEntity<String> getApiResponse() {
        return ResponseEntity.ok("V1 - API response from K8s Playground");
    }

}
