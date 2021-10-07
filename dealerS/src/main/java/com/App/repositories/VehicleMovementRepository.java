package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.VehicleMovement;

@Repository
public interface VehicleMovementRepository extends JpaRepository <VehicleMovement, Integer> {

}
