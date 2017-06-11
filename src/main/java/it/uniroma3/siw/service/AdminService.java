package it.uniroma3.siw.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.modello.Admin;
import it.uniroma3.siw.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	
	
    @Transactional
    public void add(final Admin admin) {
        this.adminRepository.save(admin);
    }
    
    public Admin findByUserName(String username){
    	return this.adminRepository.findByUsername(username);
    }
}
