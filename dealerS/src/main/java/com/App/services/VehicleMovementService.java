package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.VehicleMovement;
import com.App.repositories.VehicleMovementRepository;

@Service
public class VehicleMovementService {

	@Autowired
	private VehicleMovementRepository vehicleMovementRepository;

	
	public List<VehicleMovement> findAll(){
		return vehicleMovementRepository.findAll();
	}
	
	// Save new country
	
	public void save(VehicleMovement vehicleMovement) {
		vehicleMovementRepository.save(vehicleMovement);
	}
	
	public Optional<VehicleMovement> findById(int id){
		return vehicleMovementRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleMovementRepository.deleteById(id);
	}

}
