package it.uniroma3.siw.modello;

public class Utente {

	private Long id;
	private String username;
	private String password;

	public Utente(Long id) {
		this.id = id;
	}

	public Utente(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
