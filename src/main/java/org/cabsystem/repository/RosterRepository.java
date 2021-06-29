package org.cabsystem.repository;

import org.cabsystem.model.Roster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RosterRepository extends CrudRepository<Roster, Long> {

    List<Roster> findByTripDate(String tripDate);

   // List<Student> findByAddress(String address);

   Roster findByRosterId(long rosterId);

   long count();

    @Override
    void deleteAll();
}
