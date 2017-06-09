package it.uniroma3.siw.modello;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
public class Opera {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Size(min=1,message="Il campo nome non può essere vuoto")
	private String titolo;
	
	 @OneToOne(cascade={CascadeType.PERSIST})
	private Autore autore;
	private Date anno;
	private String tecnica;
	private float dimensioni;
	
	public Opera() {
	}
	
	public Opera(String titolo, Autore autore, Date anno, String tecnica, float dimensioni) {
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

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
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
