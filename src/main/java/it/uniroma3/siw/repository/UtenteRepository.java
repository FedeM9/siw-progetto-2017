package it.uniroma3.siw.repository;



import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.modello.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {
	  Utente findByUsername(String username);
}
