package it.uniroma3.siw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.modello.Autore;
import it.uniroma3.siw.modello.Opera;

public interface OperaRepository extends CrudRepository<Opera, Long>{

	List<Opera> findByTitolo(String titolo);
	List<Opera> findByAutore(Autore autore);
	List<Opera> findByAnno(String anno);
	List<Opera> findByTecnica(String tecnica);
	List<Opera> findByRestauro(String restauro);
}
