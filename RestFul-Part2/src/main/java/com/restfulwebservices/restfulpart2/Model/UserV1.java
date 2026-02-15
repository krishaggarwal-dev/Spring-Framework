package com.restfulwebservices.restfulpart2.Model;

public class UserV1 {
    private int id;
    private String name;

    public UserV1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
