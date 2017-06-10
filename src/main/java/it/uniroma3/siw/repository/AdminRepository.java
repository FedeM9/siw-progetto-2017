package it.uniroma3.siw.repository;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.modello.Admin;

public interface AdminRepository  extends CrudRepository<Admin, Long>{
	Admin findByUsername(String username);
	
}
