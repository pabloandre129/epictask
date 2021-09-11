package br.com.fiap.epictask.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="O nome é obrigatório")
	private String name;
		
	@NotBlank(message="O email é obrigatório")
	@Email
	private String email;
	
	@NotBlank(message="A senha é obrigatória")
	@Size(min=8,message="A senha deve ter ao menos 8 caracteres")
	private String password;
	
	
}