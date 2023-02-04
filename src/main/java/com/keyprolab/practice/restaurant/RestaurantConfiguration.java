package com.keyprolab.practice.restaurant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantConfiguration {

    @Value("${app.fakeDataEnabled:false}")
    private Boolean fakeDataEnabled;

   @Bean
    CommandLineRunner commandLineRunner() {
        return args ->
              System.out.println("hey");
    };
    @Bean
   RestaurantRepo restaurantRepo() {
    return fakeDataEnabled ?
            new RestaurantFakeRepository() :
            new RestaurantRepository();
   }
}
