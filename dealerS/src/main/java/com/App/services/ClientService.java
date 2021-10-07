package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.Client;
import com.App.repositories.ClientRepository;


@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	// Save new country
	
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	public Optional<Client> findById(int id){
		return clientRepository.findById(id);
	}
	
	public void delete(int id) {
		clientRepository.deleteById(id);
	}

}
