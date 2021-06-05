package org.cabSystem.service;

import org.cabSystem.model.RosterList;
public interface DataService {

   public void save(RosterList rosterList);
   // public List<Student> getStudent(String firstName);
     public long getCountOfAllEmp();
     public void dataDeleteAll();
}
