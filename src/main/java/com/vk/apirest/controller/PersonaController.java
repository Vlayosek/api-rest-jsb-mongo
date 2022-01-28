package com.vk.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.apirest.model.PersonaDTO;
import com.vk.apirest.service.api.PersonaServiceAPI;

@RestController
@RequestMapping("/persona/api/v1")
@CrossOrigin("*")
public class PersonaController {

	@Autowired
	private PersonaServiceAPI objPersonaServiceAPI;
	
	@GetMapping(value = "/all")
	public List<PersonaDTO> getAll() {
		return objPersonaServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public PersonaDTO find(@PathVariable Long id) {
		return objPersonaServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<PersonaDTO> save(@RequestBody PersonaDTO persona) {
		PersonaDTO obj = objPersonaServiceAPI.save(persona);
		return new ResponseEntity<PersonaDTO>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<PersonaDTO> delete(@PathVariable Long id) {
		PersonaDTO persona = objPersonaServiceAPI.get(id);
		if (persona != null) {
			objPersonaServiceAPI.delete(id);
		} else {
			return new ResponseEntity<PersonaDTO>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<PersonaDTO>(persona, HttpStatus.OK);
	}
	
}
