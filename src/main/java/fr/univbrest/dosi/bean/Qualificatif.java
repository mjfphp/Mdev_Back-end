package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qualificatif database table.
 * 
 */
@Entity
@Table(name="qualificatif")
@NamedQuery(name="Qualificatif.findAll", query="SELECT q FROM Qualificatif q")
public class Qualificatif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_QUALIFICATIF")
	private String idQualificatif;

	@Column(name="MAXIMAL")
	private String maximal;

	@Column(name="MINIMAL")
	private String minimal;

	public Qualificatif() {
	}

	public String getIdQualificatif() {
		return this.idQualificatif;
	}

	public void setIdQualificatif(String idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getMaximal() {
		return this.maximal;
	}

	public void setMaximal(String maximal) {
		this.maximal = maximal;
	}

	public String getMinimal() {
		return this.minimal;
	}

	public void setMinimal(String minimal) {
		this.minimal = minimal;
	}

}