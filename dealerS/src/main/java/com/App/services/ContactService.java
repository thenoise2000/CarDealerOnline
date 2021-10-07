package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.models.Contact;
import com.App.repositories.ContactRepository;


@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact> findAll(){
		return contactRepository.findAll();
	}
	
	// Save new country
	
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	public Optional<Contact> findById(int id){
		return contactRepository.findById(id);
	}
	
	public void delete(int id) {
		contactRepository.deleteById(id);
	}
}
