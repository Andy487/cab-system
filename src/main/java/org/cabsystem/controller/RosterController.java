package org.cabsystem.controller;

import org.cabsystem.model.Roster;
import org.cabsystem.repository.RosterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RosterController {

    @Autowired
    RosterRepository repository;

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

}
