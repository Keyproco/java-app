package com.keyprolab.practice.restaurant;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component(value = "fake")
public class RestaurantFakeRepository implements RestaurantRepo {
    @Override
    public List<Restaurant> restaurants() {
        return Arrays.asList(
                new Restaurant(1L, "Pizzio", "Den ROUDBA", "pizza"),
                new Restaurant(2L, "BollyMolly", "Den ROUDBA", "indian"),
                new Restaurant(3L, "Miam", "Den ROUDBA", "french")
        );
    }
}
