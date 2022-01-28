package com.vk.apirest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.vk.apirest.commons.GenericServiceImpl;
import com.vk.apirest.dao.api.PersonaDaoAPI;
import com.vk.apirest.model.PersonaDTO;
import com.vk.apirest.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<PersonaDTO,Long> implements PersonaServiceAPI{

	@Autowired
	private PersonaDaoAPI objPersonaDaoAPI;

	@Override
	public CrudRepository<PersonaDTO, Long> getDao() {
		// TODO Auto-generated method stub
		return objPersonaDaoAPI;
	}

}
