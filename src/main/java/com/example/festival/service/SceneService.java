package com.example.festival.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.festival.repository.SceneRepository;

@Service
public class SceneService {

	@Autowired
	SceneRepository sceneRepository;
	
}
