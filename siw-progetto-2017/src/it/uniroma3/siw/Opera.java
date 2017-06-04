package it.uniroma3.siw;

import java.util.Date;

public class Opera {

	private String titolo;
	private String autore;
	private Date anno;
	private String tecnica;
	private float dimensioni;
	
	public Opera() {
	}
	
	public Opera(String titolo, String autore, Date anno, String tecnica, float dimensioni) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.tecnica = tecnica;
		this.dimensioni = dimensioni;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public Date getAnno() {
		return anno;
	}

	public void setAnno(Date anno) {
		this.anno = anno;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public float getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(float dimensioni) {
		this.dimensioni = dimensioni;
	}
	
}
