package com.vk.apirest.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vk.apirest.model.PersonaDTO;

public interface PersonaDaoAPI extends MongoRepository<PersonaDTO, Long>{

	
	
}
