package org.cabsystem.service;

import org.cabsystem.model.Roster;
public interface DataService {

   public void save(Roster roster);
   // public List<Student> getStudent(String firstName);
     public long getCountOfAllEmp();
     public void dataDeleteAll();
}
