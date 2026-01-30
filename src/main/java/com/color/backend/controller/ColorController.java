package com.color.backend.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.color.backend.entity.Color;
import com.color.backend.service.ColorService;
import com.color.backend.dto.ColorMatchRequest;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/colors")
public class ColorController {

    private final ColorService service;

    public ColorController(ColorService service) {
        this.service = service;
    }

    // Existing
    @GetMapping
    public List<Color> getColors() {
        return service.getAllColors();
    }

    // 🔥 MATCH API
    @PostMapping("/match")
    public Color matchColor(@RequestBody ColorMatchRequest request) {
        return service.findBestMatch(
            request.getR(),
            request.getG(),
            request.getB()
        );
    }
}
