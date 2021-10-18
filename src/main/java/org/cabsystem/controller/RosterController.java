package org.cabsystem.controller;

import org.cabsystem.model.Cab;
import org.cabsystem.model.Roster;
import org.cabsystem.repository.RosterRepository;
import org.cabsystem.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class RosterController {

    @Autowired
    RosterRepository repository;
    @Autowired
    CabService cabService;

    @CrossOrigin(origins = "https://docs.google.com/document/d/1m3_N3FO07YigDpOF9Qg1NNx4LU2oAnZdtmgGUbDXtKo/edit?usp=sharing")

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/rosterlist")
    public List<Roster> rosterLists(@RequestParam String tripDate) {
        System.out.println(repository.findByTripDate("20-8-2021"));
        System.out.println(repository.findByRosterId(10));
        return repository.findByTripDate("20-8-2021");
        //return "hello";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/rosterbyid")
    public Roster rosterById(@RequestParam long id) {

        System.out.println(repository.findByTripDate("20-8-2021"));
        System.out.println(repository.findByRosterId(10));
        return repository.findByRosterId(id);
        //return "hello";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/saveRoster")
    public String saveRoster(@RequestBody Roster roster) {
        System.out.println("Saving roster " + roster);
        repository.save(roster);
        return "SAVED";
    }

    @GetMapping("/assignCabs")
    public void assign() {
        List<Roster> rosters = repository.findByTripDate("20-8-2021");
        Map<String, List<Roster>> rostersRouteWise = rosters.stream().
                collect(Collectors.groupingBy(roster -> roster.getRouteId()));
        for (String key : rostersRouteWise.keySet()) {
            List<Roster> rosterForARoute = rostersRouteWise.get(key);
            int capacity = rosterForARoute.size();
            Cab cab = cabService.getNextAvaiableCab();
        }
    }


}
