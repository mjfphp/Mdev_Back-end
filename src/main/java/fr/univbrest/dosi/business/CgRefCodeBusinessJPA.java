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
	
	@Override
	public List<CgRefCode> GetAllCgRefCodes() {
		// TODO Auto-generated method stub
		return (List<CgRefCode>) repo.findAll();
	}

	@Override
	public List<CgRefCode> FindByDomain( String domain) {
		// TODO Auto-generated method stub
		return repo.findByRvDomain(domain);
	}

}
