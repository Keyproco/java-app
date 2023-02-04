package com.keyprolab.practice.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    void createNewRestaurant(@RequestBody Restaurant restaurant) {
        System.out.println("Restaurant created");
        System.out.println(restaurant);
    }
    @PatchMapping("/")
    void updateRestaurant(@RequestBody Restaurant restaurant) {

    }
    @DeleteMapping(path = "{restaurantId}")
    void deleteRestaurant(@PathVariable("restaurantId") Long id) {
        System.out.println("Restaurant deleted");
        System.out.println(id);
    }

}
