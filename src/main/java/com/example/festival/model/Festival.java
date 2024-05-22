package com.example.festival.model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.*;
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


	@Lob
	@Column(name = "festival_description", columnDefinition = "TEXT")
	private String desc;
	//liste scène
	@OneToMany
	@JoinColumn(name = "festival_id")
	List<Scene> scenesList = new ArrayList<>();


}
