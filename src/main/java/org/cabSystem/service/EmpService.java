package org.cabSystem.service;

import org.cabSystem.model.RosterList;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpService {

    @Autowired
    public DataService dataService;

    public long getCountOfAllEmp(){
        return  dataService.getCountOfAllEmp();
    }

    public void addNewRoster(RosterList rosterList) {
        dataService.save(rosterList);
    }

   // public void dataSave(Student student) { dataService.save(student);}

    public void dataDelete() { dataService.dataDeleteAll();
    }
}
