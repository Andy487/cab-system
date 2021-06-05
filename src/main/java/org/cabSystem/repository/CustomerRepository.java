package org.cabSystem.repository;

import org.cabSystem.model.RosterList;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends CrudRepository<RosterList, Long> {

    List<RosterList>findByDateFrom(String dateFrom);

   // List<Student> findByAddress(String address);

   RosterList findByrosterId(long rosterId);

   long count();

    @Override
    void deleteAll();
}
