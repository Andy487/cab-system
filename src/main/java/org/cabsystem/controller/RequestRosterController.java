package org.cabsystem.controller;

import org.cabsystem.repository.RosterRepository;
import org.cabsystem.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestRosterController {


    @Autowired
    RosterRepository repository;
    @Autowired
    CabService cabService;


    @GetMapping("/requestRoter")
    public String requestRoter(){
        return "requestRoter";
    }
}
