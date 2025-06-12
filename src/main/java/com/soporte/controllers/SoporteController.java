package com.soporte.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/soporte")
public class SoporteController {

    @GetMapping
    public List<String> getAll() {
        return new ArrayList<>();
    }

    @PostMapping
    public String create(@RequestBody String body) {
        return "Created: " + body;
    }
}
