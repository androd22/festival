package com.example.festival.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.festival.model.Groupe;
import com.example.festival.service.GroupeService;

@Controller
public class GroupeController {

	@Autowired
	GroupeService groupeService;
	
	
	@GetMapping("/getAllGroupes")
	public String getAllGroupes(Model model){
		model.addAttribute("ListeGroupes",  groupeService.getAllGroupes());
		return "groupe/listGroupe";
	}

	@GetMapping("new")
	public String groupNewForm(Model model){

		model.addAttribute("groupe", new Groupe());
		return "groupe_form";
	}
}
