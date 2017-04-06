package com.example.bojidar_pavel.testapp2.model;

/**
 * Created by Bojidar on 3/28/2017.
 */

public class Goat {
    private String name;
    private int age;
    private int imgId;

    public Goat(String name, int age, int imgId){
        this.name=name;
        this.age=age;
        this.imgId=imgId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImgId() {
        return imgId;
    }
}
