package it.uniroma3.siw.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.modello.Autore;
import it.uniroma3.siw.modello.Opera;
import it.uniroma3.siw.repository.OperaRepository;



@Service
public class OperaService {
	
	@Autowired
	private OperaRepository operaRepository;
	
    public Iterable<Opera> findAll() {
        return this.operaRepository.findAll();
    }
	public   Iterable<Opera> findByAutore(Autore autore){
		return this.operaRepository.findByAutore(autore);
	}
	
	public Iterable<Opera> findByAnno(Date  anno){
		return this.operaRepository.findByAnno(anno);
	}
	public Iterable<Opera> findByTecnica(String tecnica){
		return this.operaRepository.findByTecnica(tecnica);
	}
	
	public void add(final Opera opera){
		this.operaRepository.save(opera);
	}
}
