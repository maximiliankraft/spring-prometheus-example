package at.spengergasse.observable.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import at.spengergasse.observable.Entity.GenericEntity;

public interface GenericRepository extends JpaRepository<GenericEntity, Integer> {
    
}
