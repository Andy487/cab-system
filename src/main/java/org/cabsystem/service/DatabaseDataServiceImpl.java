package org.cabsystem.service;

import org.cabsystem.model.Roster;
import org.cabsystem.repository.RosterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

//import java.util.List;

@Profile({"mysql"})
public class DatabaseDataServiceImpl implements DataService {


    public RosterRepository customerRepository;

    @Autowired
    public DatabaseDataServiceImpl(RosterRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void save(Roster roster) {
        customerRepository.save(roster);
    }

//    public List<Student> getStudent(String name) {
//        return customerRepository.findByName(name);
//    }
    public long getCountOfAllEmp(){
        return customerRepository.count();
    }
    public void dataDeleteAll(){  customerRepository.deleteAll(); }
}
