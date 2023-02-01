package com.keyprolab.practice.restaurant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
    private RestaurantService restaurantService = new RestaurantService();
    
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/")
    Restaurant restaurant() {
        return restaurantService.restaurant();
    }

}
