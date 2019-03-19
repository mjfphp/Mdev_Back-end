package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.CgRefCode;


@Repository

public interface CgRefCodeRepository extends CrudRepository<CgRefCode, String> {
	
	List<CgRefCode> findByRvDomain(String domain);
}
