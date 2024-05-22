package com.example.festival.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import static org.hibernate.Length.LONG;


@Entity
//@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Data
public class Festival {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "festival_id")
	private Long id;
	
	@Column(name= "festival_nom")
	private String nom;

	@Column(name = "festival_description", length = LONG)

	private String desc;
	//liste scène
	@OneToMany
	@JoinColumn(name = "festival_id")
	List<Scene> scenesList = new ArrayList<>();
	
}
