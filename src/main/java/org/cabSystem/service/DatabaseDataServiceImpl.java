package org.cabSystem.service;

import org.cabSystem.model.RosterList;
import org.cabSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

//import java.util.List;

@Profile({"mysql"})
public class DatabaseDataServiceImpl implements DataService {


    public CustomerRepository customerRepository;

    @Autowired
    public DatabaseDataServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void save(RosterList rosterList) {
        customerRepository.save(rosterList);
    }

//    public List<Student> getStudent(String name) {
//        return customerRepository.findByName(name);
//    }
    public long getCountOfAllEmp(){
        return customerRepository.count();
    }
    public void dataDeleteAll(){  customerRepository.deleteAll(); }
}
