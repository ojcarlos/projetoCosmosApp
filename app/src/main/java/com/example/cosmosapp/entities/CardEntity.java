package com.example.cosmosapp.entities;

import java.util.Objects;

public class CardEntity {
    private int id;
    private int img;
    private int planetId;

    public CardEntity() {
    }

    public CardEntity(int id, int img, int planetId) {
        this.id = id;
        this.img = img;
        this.planetId = planetId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getPlanetId() {
        return planetId;
    }

    public void setPlanetId(int planetId) {
        this.planetId = planetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardEntity that = (CardEntity) o;
        return planetId == that.planetId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetId);
    }
}
