package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.bean.UniteEnseignementPK;

public interface UniteEnseignementRepository extends CrudRepository<UniteEnseignement, UniteEnseignementPK> {
	
	@Query(value = "SELECT unite_enseignement.* FROM `unite_enseignement` WHERE CODE_FORMATION =?2 AND NO_ENSEIGNANT=?1 ORDER BY DESIGNATION", nativeQuery = true)
	List<UniteEnseignement> GetAllUniteEnseignementForEnseignantAndCodeFormation(Integer  noEnseignant, String codeFormation);

}
