package com.keyprolab.practice.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/")
    List<Restaurant> restaurants() {
        return  restaurantService.restaurants();
    }

    @PostMapping
    void createNewRestaurant(@RequestBody Restaurant restaurant) {
        System.out.println("Restaurant created");
        System.out.println(restaurant);
    }

}
