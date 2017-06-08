package it.uniroma3.siw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import it.uniroma3.siw.modello.Opera;

public interface OperaRepository extends CrudRepository<Opera, Long>{
	
	  List<Opera> findAll(String lastName);

}
