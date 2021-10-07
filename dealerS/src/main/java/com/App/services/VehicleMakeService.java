package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.VehicleMake;
import com.App.repositories.VehicleMakeRepository;



@Service
public class VehicleMakeService {

	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;

	
	public List<VehicleMake> findAll(){
		return vehicleMakeRepository.findAll();
	}
	
	// Save new country
	
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	public Optional<VehicleMake> findById(int id){
		return vehicleMakeRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleMakeRepository.deleteById(id);
	}

}
