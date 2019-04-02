package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.CgRefCode;


public interface CgRefCodeBusiness {

	// fonction qui retroune une liste de tout les CgRefCodes
	List<CgRefCode> GetAllCgRefCodes();
	
	// fonction qui retourne une liste de CgRefcodes par domaine
	List<CgRefCode> FindByDomain(String domain);

}
