package com.example.festival.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.festival.model.Groupe;
import com.example.festival.repository.GroupeRepository;

@Service
public class GroupeService {

	@Autowired
	GroupeRepository groupeRepository;
	
	public List<Groupe> getAllGroupes(){
		return (List<Groupe>) groupeRepository.findAll();
	}
	
}
