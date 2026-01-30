package com.color.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "colors")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String color_name;
    private String hex_code;
    private int r;
    private int g;
    private int b;
    private boolean available;

    // getters & setters
    public int getId() { return id; }
    public String getColor_name() { return color_name; }
    public void setColor_name(String color_name) { this.color_name = color_name; }

    public String getHex_code() { return hex_code; }
    public void setHex_code(String hex_code) { this.hex_code = hex_code; }

    public int getR() { return r; }
    public int getG() { return g; }
    public int getB() { return b; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
