package com.ngn.ecentric.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngn.ecentric.contact.entity.Contact;
import com.ngn.ecentric.contact.repository.ContactRepository;

@RestController
@RequestMapping("/contact")
@CrossOrigin({"http://localhost:4200"})
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepo;

	@GetMapping("/")
	public List<Contact> getContacts(){
		return contactRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Contact getContactById(@PathVariable int id) {
		return contactRepo.findById(id).get();
	}
	
	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact) {
		return contactRepo.save(contact);
	}
}
