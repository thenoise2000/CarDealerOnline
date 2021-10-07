package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.VehicleType;
import com.App.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	public List<VehicleType> findAll(){
		return vehicleTypeRepository.findAll();
	}
	
	// Save new country
	
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}
	
	public Optional<VehicleType> findById(int id){
		return vehicleTypeRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleTypeRepository.deleteById(id);
	}

}
