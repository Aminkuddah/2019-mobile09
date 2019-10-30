package com.example.recyclerviewsangatsederhanatugas1.models;

public class SuperHero {
//    public int gambarHero;
//    public String deskripsi;
//
//    public SuperHero(int heroName) {
//
//        this.gambarHero= gambarHero;
//    }
//
//    public int getGambarHero() {
//
//        return gambarHero;
//    }
//
//    public void setGambarHero(String heroName) {
//
//        this.gambarHero = gambarHero;
//    }
//
//    public SuperHero(int joker10, String deskripsi) {
//        this.deskripsi = deskripsi;
//    }
//
//    public String getDeskripsi() {
//        return deskripsi;
//    }
//
//    public void setDeskripsi(String heroName) {
//
//        this.deskripsi = deskripsi;
//    }

    public String heroName;
    public String heroText;
    public int heroImage;

    public SuperHero(String heroName, String heroText, int heroImage) {
        this.heroName = heroName;
        this.heroText = heroText;
        this.heroImage = heroImage;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroText() {
        return heroText;
    }

    public void setHeroText(String heroText) {
        this.heroText = heroText;
    }


    public int getHeroImage() {
        return heroImage;
    }


    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }
}
