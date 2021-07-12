package com.example.animals;

public class Animals {
    private String name;
    private String sound;
    private int Image;

    public Animals(String name, String sound, int image) {
        this.name = name;
        this.sound = sound;
        this.Image = image;
    }

    public  String getName() {
        return name;
    }

    public  String getSound() {
        return sound;
    }

    public int getImage() {
        return Image;
    }
}
