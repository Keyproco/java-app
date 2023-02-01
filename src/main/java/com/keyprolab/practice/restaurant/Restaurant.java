package com.keyprolab.practice.restaurant;

public class Restaurant {    private final Long id;
    private final String name;
    private final String owner;
    private final String speciality;
    Restaurant(Long id, String name, String owner, String speciality) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.speciality = speciality;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getSpeciality() {
        return speciality;
    }

}
