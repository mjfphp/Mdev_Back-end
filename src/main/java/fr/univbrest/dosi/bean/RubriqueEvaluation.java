package fr.univbrest.dosi.bean;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the rubrique_evaluation database table.
 * 
 */
@Entity
@Table(name="rubrique_evaluation")
@NamedQuery(name="RubriqueEvaluation.findAll", query="SELECT r FROM RubriqueEvaluation r")
public class RubriqueEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_RUBRIQUE_EVALUATION")
	private int idRubriqueEvaluation;

	@Column(name="DESIGNATION")
	private String designation;

	@Column(name="ORDRE")
	private int ordre;

	//uni-directional many-to-one association to Evaluation
	//@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION")
	private Evaluation evaluation;

	//uni-directional many-to-one association to Rubrique
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE")
	private Rubrique rubrique;

	public RubriqueEvaluation() {
	}

	public int getIdRubriqueEvaluation() {
		return this.idRubriqueEvaluation;
	}

	public void setIdRubriqueEvaluation(int idRubriqueEvaluation) {
		this.idRubriqueEvaluation = idRubriqueEvaluation;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Rubrique getRubrique() {
		return this.rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

}