package com.keyprolab.practice.restaurant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
    private final RestaurantService restaurantService= new RestaurantService();

    @GetMapping("/")
    Restaurant restaurant() {
        return restaurantService.restaurant();
    }

}
