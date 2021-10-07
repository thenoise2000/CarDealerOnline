package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.App.models.VehicleStatus;
import com.App.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {

	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;

	
	public List<VehicleStatus> findAll(){
		return vehicleStatusRepository.findAll();
	}
	
	// Save new country
	
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}
	
	public Optional<VehicleStatus> findById(int id){
		return vehicleStatusRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleStatusRepository.deleteById(id);
	}

}
