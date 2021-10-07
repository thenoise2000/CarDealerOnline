package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.Country;
import com.App.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> findAll(){
		return countryRepository.findAll();
	}
	
	// Save new country
	
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(int id){
		return countryRepository.findById(id);
	}
	
	public void delete(int id) {
		countryRepository.deleteById(id);
	}

}
