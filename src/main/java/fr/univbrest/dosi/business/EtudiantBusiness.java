package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Etudiant;

public interface EtudiantBusiness {

	public Etudiant CreateEtudiant(Etudiant etud) ;
	

	public List<Etudiant> GetAllEtudiants();


	void deleteEtudiant(String NO_ETUDIANT);

}
