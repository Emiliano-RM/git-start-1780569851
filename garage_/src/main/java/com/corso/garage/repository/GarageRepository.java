package com.corso.garage.repository;

import com.corso.garage.entity.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GarageRepository extends JpaRepository<Garage, Long> {
    //@Query("SELECT g FROM Garage g LEFT JOIN FETCH g.veicoli WHERE g.id = :id")
    //Optional<Garage> findByIdWithVeicoli(@Param("id") Long id);

}
