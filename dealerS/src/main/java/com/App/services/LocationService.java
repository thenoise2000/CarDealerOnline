package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.Location;

import com.App.repositories.LocationRepository;


@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> findAll(){
		return locationRepository.findAll();
	}
	
	// Save new country
	
	public void save(Location location) {
		locationRepository.save(location);
	}
	
	public Optional<Location> findById(int id){
		return locationRepository.findById(id);
	}
	
	public void delete(int id) {
		locationRepository.deleteById(id);
	}

}
