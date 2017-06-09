package it.uniroma3.siw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import it.uniroma3.siw.modello.Autore;

public interface AutoreRepository extends CrudRepository<Autore, Long>{
	
	  List<Autore> findAll(String lastName);
}
