package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.App.models.VehicleModel;

import com.App.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {

	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	
	public List<VehicleModel> findAll(){
		return vehicleModelRepository.findAll();
	}
	
	// Save new country
	
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}
	
	public Optional<VehicleModel> findById(int id){
		return vehicleModelRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleModelRepository.deleteById(id);
	}

	
}
