package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository <VehicleModel, Integer> {

}
