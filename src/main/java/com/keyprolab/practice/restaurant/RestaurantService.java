package com.keyprolab.practice.restaurant;

import org.springframework.stereotype.Component;
@Component
public class RestaurantService {
    Restaurant restaurant() {
        return new Restaurant(1L, "Pizzio", "Den ROUDBA", "pizza");
    }
}
