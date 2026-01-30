package com.color.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.color.backend.entity.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {
}
