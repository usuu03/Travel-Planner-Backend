package com.travelplanner.travelplanner.controller;

import com.travelplanner.travelplanner.models.Destination;
import com.travelplanner.travelplanner.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DestinationController {

    @Autowired
    private final DestinationRepository destinationRepository;

    public DestinationController(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @GetMapping("/destinations")
    public List<Destination> getAllDestinations(){
        return destinationRepository.findAll();
    }
}
