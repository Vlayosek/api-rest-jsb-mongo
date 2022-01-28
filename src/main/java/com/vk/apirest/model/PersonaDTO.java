package com.vk.apirest.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="personas")
public class PersonaDTO{
	
	@Id
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String telefono;
	
	private String estado;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
	
	

}
