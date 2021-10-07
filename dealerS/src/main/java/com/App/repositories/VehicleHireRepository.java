package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.VehicleHire;

@Repository
public interface VehicleHireRepository extends JpaRepository <VehicleHire, Integer> {

}
