package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rubrique_question database table.
 * 
 */
@Embeddable
public class RubriqueQuestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_RUBRIQUE", insertable=false, updatable=false)
	private long idRubrique;

	@Column(name="ID_QUESTION", insertable=false, updatable=false)
	private long idQuestion;

	public RubriqueQuestionPK() {
	}
	public long getIdRubrique() {
		return this.idRubrique;
	}
	public void setIdRubrique(long idRubrique) {
		this.idRubrique = idRubrique;
	}
	public long getIdQuestion() {
		return this.idQuestion;
	}
	public void setIdQuestion(long idQuestion) {
		this.idQuestion = idQuestion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idQuestion ^ (idQuestion >>> 32));
		result = prime * result + (int) (idRubrique ^ (idRubrique >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RubriqueQuestionPK other = (RubriqueQuestionPK) obj;
		if (idQuestion != other.idQuestion)
			return false;
		if (idRubrique != other.idRubrique)
			return false;
		return true;
	}
 
}