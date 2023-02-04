package com.keyprolab.practice.restaurant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restaurant {

    private final Long id;
    private final String name;
    private final String owner;
    private final String speciality;

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    Restaurant(Long id, String name, String owner, String speciality) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.speciality = speciality;
    }
    @JsonProperty("restaurant_id")
    public Long getId() {
        return id;
    }
// to hide a property add @JsonIgnore
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
