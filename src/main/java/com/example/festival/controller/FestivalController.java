package com.example.festival.controller;

import com.example.festival.model.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.festival.service.FestivalService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class FestivalController {

	@Autowired
	FestivalService festivalService;

	@GetMapping("/")
	public String homePage(Model model){
		Festival festival= festivalService.getId().get();
		model.addAttribute("festival", festival);
		return "home";
	}

}
