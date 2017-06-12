package it.uniroma3.siw.modello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;


@Entity
public class Opera {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Size(min=1,message="Il campo nome non può essere vuoto")
	private String titolo;
	
	@OneToOne
	private Autore autore;
	private String anno;
	private String tecnica;
	private String dimensioni;
	private String restauro;
	
	public Opera() {
	}
	
	public Opera(String titolo, Autore autore, String anno, String tecnica, String dimensioni, String restauro) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.tecnica = tecnica;
		this.dimensioni = dimensioni;
		this.restauro = restauro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String getRestauro() {
		return restauro;
	}

	public void setRestauro(String restauro) {
		this.restauro = restauro;
	}
	
}
