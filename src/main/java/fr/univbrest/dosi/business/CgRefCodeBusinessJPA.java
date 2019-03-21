package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.CgRefCode;
import fr.univbrest.dosi.repository.CgRefCodeRepository;



@Service
public class CgRefCodeBusinessJPA implements CgRefCodeBusiness {

	CgRefCodeRepository repo;
	
	@Autowired
	public CgRefCodeBusinessJPA(CgRefCodeRepository repos) {
		this.repo = repos;
	}
	
	// fonction qui retroune une liste de tout les CgRefCodes
	@Override
	public List<CgRefCode> GetAllCgRefCodes() {
		return (List<CgRefCode>) repo.findAll();
	}

	// fonction qui retourne une liste de CgRefcodes par domaine
	@Override
	public List<CgRefCode> FindByDomain( String domain) {
		return repo.findByRvDomain(domain);
	}

}
