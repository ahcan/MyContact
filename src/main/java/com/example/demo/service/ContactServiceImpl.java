package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Iterable<Contact> findAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> search(String term) {
		// TODO Auto-generated method stub
		return contactRepository.findByName(term);
	}

	@Override
	public Optional<Contact> findOne(Integer id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}

	@Override
	public void save(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
	}

}
