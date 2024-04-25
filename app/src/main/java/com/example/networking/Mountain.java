package com.example.networking;

import androidx.annotation.NonNull;

public class Mountain {

    private String ID;
    private String name;
    private String type;
    private String location;
    private int size;
    private int cost;

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
