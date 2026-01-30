package com.color.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.color.backend.entity.Color;
import com.color.backend.repository.ColorRepository;

@Service
public class ColorService {

    private final ColorRepository repo;

    public ColorService(ColorRepository repo) {
        this.repo = repo;
    }

    // Existing
    public List<Color> getAllColors() {
        return repo.findAll();
    }

    // 🔥 MATCH LOGIC
    public Color findBestMatch(int r, int g, int b) {

        List<Color> colors = repo.findAll();

        Color bestMatch = null;
        double minDistance = Double.MAX_VALUE;

        for (Color c : colors) {

            double distance = Math.sqrt(
                Math.pow(r - c.getR(), 2) +
                Math.pow(g - c.getG(), 2) +
                Math.pow(b - c.getB(), 2)
            );

            if (distance < minDistance) {
                minDistance = distance;
                bestMatch = c;
            }
        }

        return bestMatch;
    }
}
