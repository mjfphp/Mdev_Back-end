package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rubrique database table.
 * 
 */
@Entity
@Table(name="rubrique")
@NamedQuery(name="Rubrique.findAll", query="SELECT r FROM Rubrique r")
public class Rubrique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_RUBRIQUE")
	private String idRubrique;

	@Column(name="DESIGNATION")
	private String designation;

	@Column(name="ORDRE")
	private double ordre;

	@Column(name="TYPE")
	private String type;

	//uni-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT")
	private Enseignant enseignant;

	public Rubrique(String getIdRubrique) {
	}
	
	

	public Rubrique(String idRubrique, String designation, double ordre, String type, Enseignant enseignant) {
		super();
		this.idRubrique = idRubrique;
		this.designation = designation;
		this.ordre = ordre;
		this.type = type;
		this.enseignant = enseignant;
	}



	public String getIdRubrique() {
		return this.idRubrique;
	}

	public void setIdRubrique(String idRubrique) {
		this.idRubrique = idRubrique;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getOrdre() {
		return this.ordre;
	}

	public void setOrdre(double ordre) {
		this.ordre = ordre;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

}