package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Qualificatif;

public interface QualificatifBusiness {

	// fonction qui retorune tous les qualificatifs
	public List<Qualificatif> GetAllQualificatifs();

	// fonction qui supprime un qualificatif
	void deleteQualificatif(Integer idQualificatif);

	// fonction qui crée un qualificatif
	public Qualificatif createQualificatif(Qualificatif qualificatif);

	// fonction qui cherche un qualificatif
	public Qualificatif findQualificationById(Integer idQualificatif);

	// fonction qui cherche un qualificatif par min
	public List<Qualificatif> findQualificationByMin(String minimal);

	// fonction qui cherche un qualificatif par max
	public List<Qualificatif> findQualificationByMax(String maximal);

	// fonction qui vérifie si un qualificatif exsite dans une réponse
	public boolean findIfIdQualificatifExistsInReponse(Integer idQualificatif);

	// fonction qui modifie un qualificatif
	public Qualificatif updateQualificatifById(Qualificatif qualificatif);

}
