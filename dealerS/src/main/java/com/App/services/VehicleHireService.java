package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.VehicleHire;
import com.App.repositories.VehicleHireRepository;

@Service
public class VehicleHireService {

	@Autowired
	private VehicleHireRepository vehicleHireRepository;

	
	public List<VehicleHire> findAll(){
		return vehicleHireRepository.findAll();
	}
	
	// Save new country
	
	public void save(VehicleHire vehicleHire) {
		vehicleHireRepository.save(vehicleHire);
	}
	
	public Optional<VehicleHire> findById(int id){
		return vehicleHireRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleHireRepository.deleteById(id);
	}

}
