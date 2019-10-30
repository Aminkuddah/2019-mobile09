package com.example.recyclerviewsangatsederhanatugas1.models;

public class SuperHero {
    public int gambarHeroName;
    public String deskripsi;

    public SuperHero(int heroName) {
        this.gambarHeroName = gambarHeroName;
    }

    public int getGambarHeroName() {
        return gambarHeroName;
    }

    public void setGambarHeroName(String heroName) {
        this.gambarHeroName = gambarHeroName;
    }

    public SuperHero(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String geteskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String heroName) {
        this.deskripsi = deskripsi;
    }
}
