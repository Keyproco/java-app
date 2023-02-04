package com.keyprolab.practice.restaurant;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
@Component
@Primary
public class RestaurantRepository implements  RestaurantRepo {

    @Override

    public List<Restaurant> restaurants() {
        return Collections.emptyList();
    }
}
