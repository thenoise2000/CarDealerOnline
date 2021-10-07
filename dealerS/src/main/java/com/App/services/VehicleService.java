package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.App.models.Vehicle;

import com.App.repositories.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	public List<Vehicle> findAll(){
		return vehicleRepository.findAll();
	}
	
	// Save new country
	
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	public Optional<Vehicle> findById(int id){
		return vehicleRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleRepository.deleteById(id);
	}
}
