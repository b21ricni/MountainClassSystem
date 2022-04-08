package com.example.mountainclasssystem;

public class Mountain {
    private int height_m;
    private String name;
    private String location;

    public Mountain(int height_m, String name, String location) {
        this.height_m = height_m;
        this.name = name;
        this.location = location;
    }

    public int getHeight_m() {
        return height_m;
    }

    public void setHeight_m(int height_m) {
        this.height_m = height_m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

