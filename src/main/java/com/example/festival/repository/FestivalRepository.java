package com.example.festival.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.festival.model.Festival;

public interface FestivalRepository extends CrudRepository<Festival, Long>{

}
