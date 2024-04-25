package com.example.networking;

public class Mountain {

    private String name;
    private String type;
    private String location;
    private int metersAboveSeaLevel;

    public Mountain(String name, String type, String location, int height){
        this.name = name;
        this.type = type;
        this.location = location;
        metersAboveSeaLevel = height;
    }
}
