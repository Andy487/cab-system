package org.cabsystem.service;

import org.cabsystem.model.Roster;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpService {

    @Autowired
    public DataService dataService;

    public long getCountOfAllEmp(){
        return  dataService.getCountOfAllEmp();
    }

    public void addNewRoster(Roster roster) {
        dataService.save(roster);
    }


    public void dataDelete() { dataService.dataDeleteAll();
    }
}
