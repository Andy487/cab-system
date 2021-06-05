package org.cabSystem.repository;

import org.springframework.stereotype.Repository;
import org.cabSystem.model.Route;
import org.springframework.data.repository.CrudRepository;

@Repository
  public interface RouteRepository extends CrudRepository<Route , Long>{
    
      
  }