package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    Beer JackAmber=new Beer("Jack Amber",66);
    Beer RedMoose=new Beer("Red Moose",67);
    Beer JaliPaleAle=new Beer("Jali PaleAle",68);
    Beer GoutStout=new Beer("Gout Stout",69);
    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add(JackAmber);
            brands.add(RedMoose);
        } else {
            brands.add(JaliPaleAle);
            brands.add(GoutStout);
        }
        return brands;
    }
}
