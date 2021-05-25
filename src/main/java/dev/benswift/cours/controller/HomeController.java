package dev.benswift.cours.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

        @Value("${server.port}")
        private int port;
        @Value("${message.string}")
        private String message;

        @GetMapping("index")
        private ResponseEntity index()
        {
            return ResponseEntity.ok(String.format(message+": "+port));
        }
}
