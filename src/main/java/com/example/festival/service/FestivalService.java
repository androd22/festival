package com.example.festival.service;

import com.example.festival.model.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.festival.repository.FestivalRepository;

import java.util.Optional;

@Service
public class FestivalService {

	@Autowired
	FestivalRepository festivalRepository;


	public Optional<Festival> getId(){
		 return festivalRepository.findById(1L);
	}
}
