package it.uniroma3.siw.modello;

import javax.persistence.Entity;

@Entity
public class Admin extends Utente {
	
	public Admin(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, String username, String password) {
		super(id, username, password);
		// TODO Auto-generated constructor stub
	}

}
