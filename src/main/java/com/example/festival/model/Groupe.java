package com.example.festival.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
@Table(name="groupe")
public class Groupe {

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "groupe_id")
	private long id;
	
	@Getter
	@Column(name= "groupe_nom")
	private String nom;
	
	//scène
	@Getter
	@ManyToOne
	@JoinColumn(name = "scene_id")
	private Scene scene;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
}
