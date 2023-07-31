package com.travelplanner.travelplanner.config;

import com.travelplanner.travelplanner.models.Destination;
import com.travelplanner.travelplanner.repository.DestinationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DestinationConfig {

    @Bean
    CommandLineRunner commandLineRunner(DestinationRepository destinationRepository){
        return args -> {
            Destination Lagos = new Destination(
                    "Lagos",
                    "Nigeria",
                    "Visiting my extended family back at home",
                    824.90
            );

            Destination Madrid = new Destination(
                    "Madrid",
                    "Spain",
                    "Going back to my home town to visit old friends for two weeks",
                    245.62
            );

            Destination Faro = new Destination(
                    "Portimao",
                    "Portugal",
                    "Used the LuckyTrip app to find a cheap vacation and it came up with this",
                    184.02
            );

            destinationRepository.saveAll(List.of(Lagos, Madrid, Faro));
        };
    }

}
