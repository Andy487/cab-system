package org.cabsystem.service;

import org.cabsystem.model.Roster;
public interface DataService {

   public void save(Roster roster);
     public long getCountOfAllEmp();
     public void dataDeleteAll();
}
