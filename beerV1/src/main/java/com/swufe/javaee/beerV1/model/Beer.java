package com.swufe.javaee.beerV1.model;

public class Beer {
    private String band;
    private int year_of_birth;

    public Beer(String band, int year_of_birth) {
        this.band = band;
        this.year_of_birth = year_of_birth;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}
