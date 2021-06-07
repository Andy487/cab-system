package org.cabsystem.controller;

import org.cabsystem.model.Cab;
import org.cabsystem.model.Roster;
import org.cabsystem.repository.RosterRepository;
import org.cabsystem.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class RosterController {

    @Autowired
    RosterRepository repository;
    @Autowired
    CabService cabService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/rosterlist")
    public List<Roster> rosterLists(@RequestParam String date){
        System.out.println(repository.findByDateFrom("20-8-2021"));
        System.out.println(repository.findByRosterId(10));
        return repository.findByDateFrom("20-8-2021");
        //return "hello";
    }

    @GetMapping("/rosterbyid")
    public Roster rosterById(@RequestParam long id){

        System.out.println(repository.findByDateFrom("20-8-2021"));
        System.out.println(repository.findByRosterId(10));
        return repository.findByRosterId(id);
        //return "hello";
    }

    @PostMapping("/saveRoster")
    public String saveRoster(@RequestBody Roster roster){
        System.out.println("Saving roster " + roster);
        repository.save(roster);
        return "SAVED";
    }

    @GetMapping("/assignCabs")
    public void assign(){
        List<Roster> rosters = repository.findByDateFrom("20-8-2021");
        Map<String, List<Roster>> rostersRouteWise = rosters.stream().
                collect(Collectors.groupingBy(roster ->  roster.getRouteId() ));

        for(String key : rostersRouteWise.keySet()) {
            List<Roster> rosterForARoute = rostersRouteWise.get(key);
            int capacity = rosterForARoute.size();

            Cab cab = cabService.getNextAvaiableCab();

        }


    }



}
