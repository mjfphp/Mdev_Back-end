package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.CgRefCode;


public interface CgRefCodeBusiness {

	List<CgRefCode> GetAllCgRefCodes();
	
	List<CgRefCode> FindByDomain(String domain);

}
