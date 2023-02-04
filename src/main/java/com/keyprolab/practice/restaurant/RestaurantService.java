package com.keyprolab.practice.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepo restaurantRepo;

    @Autowired
    // if you want to use fake data @Qualifier("fake")
    public RestaurantService(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }


    List<Restaurant> restaurants() {
        return  restaurantRepo.restaurants();
    }
}
