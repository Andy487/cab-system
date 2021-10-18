package org.cabsystem.repository;
import org.cabsystem.model.RequestRoster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRosterRepository extends CrudRepository<RequestRoster , Long>{

    RequestRoster findByRequestRosterId(long requestRosterId);
}
