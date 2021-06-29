package org.cabsystem.repository;
import org.cabsystem.model.RequestRoster;
import org.springframework.data.repository.CrudRepository;

public interface RequestRosterRepository extends CrudRepository<RequestRoster , Long>{
 
    RequestRoster findByRequestRoster(long requestRosterId);
}
