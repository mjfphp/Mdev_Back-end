package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;

public interface ElementConstitutifRepository extends CrudRepository<ElementConstitutif, ElementConstitutifPK> {

	@Query(value = "SELECT element_constitutif.* FROM `element_constitutif` WHERE NO_ENSEIGNANT=?1  AND CODE_FORMATION=?2 AND CODE_UE=?3", nativeQuery = true)
	List<ElementConstitutif> GetAllElementConstitutifForEnseignantCodeUEAndCodeFormation(Integer  noEnseignant, String codeFormation, String codeU );

}
