package com.example.cosmosapp.entities;

import android.widget.ImageView;

import java.nio.file.Path;

public class PlanetEntity {

    private int id;
    private String name;
    private String information;
    private int img;

    public PlanetEntity() {
    }

    public PlanetEntity(int id, String name, String information, int img) {
        this.id = id;
        this.name = name;
        this.information = information;
        this.img = img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getImg() {
        return img;
    }
}
