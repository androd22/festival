package com.example.festival.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.festival.service.SceneService;

@Controller
public class SceneController {

	@Autowired
	SceneService sceneService;
}
