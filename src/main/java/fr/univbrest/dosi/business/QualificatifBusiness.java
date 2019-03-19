package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Qualificatif;

public interface QualificatifBusiness {
	

	

	public List<Qualificatif> GetAllQualificatifs();


	void deleteQualificatif(Integer idQualificatif);


	public Qualificatif createQualificatif(Qualificatif qualificatif);
	
	public Qualificatif findQualificationById(Integer idQualificatif);
	
	public List<Qualificatif> findQualificationByMin(String minimal);
	
	public List<Qualificatif> findQualificationByMax(String maximal);
	
	public boolean findIfIdQualificatifExistsInReponse(Integer idQualificatif);
	
	public Qualificatif updateQualificatifById(Qualificatif qualificatif);
	
	
	
	
	

}
