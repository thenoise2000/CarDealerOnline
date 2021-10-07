package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {

}
