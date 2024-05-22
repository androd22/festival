package com.example.festival.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Scene {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "scene_id")
	private Long id;
	
	@Column(name= "scene_nom")
	private String nom;

	@ManyToOne
	@JoinColumn(name = "festival_id")
	private Festival festival;
	
	//liste groupe
	@OneToMany
	@JoinColumn(name = "scene_id")
	private List<Groupe> groupe_liste = new ArrayList<>();
}
