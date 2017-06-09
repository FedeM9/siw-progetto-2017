package it.uniroma3.siw.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.modello.Opera;
import it.uniroma3.siw.repository.OperaRepository;

@Service
public class OperaService {
	
	@Autowired
	private OperaRepository operaRepository;
	
    public Iterable<Opera> findAll() {
        return this.operaRepository.findAll();
    }
    
    @Transactional
    public void add(final Opera opera) {
        this.operaRepository.save(opera);
    }

	public Opera findbyId(Long id) {
		return this.operaRepository.findOne(id);
	}
	
}
