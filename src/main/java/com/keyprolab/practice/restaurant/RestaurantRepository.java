package com.keyprolab.practice.restaurant;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Component
@Primary
public class RestaurantRepository implements  RestaurantRepo {

    @Override
    public List<Restaurant> restaurants() {
        return Arrays.asList(
                new Restaurant(1L, "eq", "Den ROUDBA", "pizza"),
                new Restaurant(2L, "BowdfllyMolly", "Den ROUDBA", "indian"),
                new Restaurant(3L, "Miwwdam", "Den ROUDBA", "french")
        );
    }
}
