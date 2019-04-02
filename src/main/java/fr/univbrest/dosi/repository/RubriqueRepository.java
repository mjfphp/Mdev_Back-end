package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Rubrique;

@Repository
public interface RubriqueRepository extends CrudRepository<Rubrique, String> {

	@Query(value = "SELECT * FROM rubrique WHERE TYPE='RBS' OR NO_ENSEIGNANT=?1", nativeQuery = true)
	List<Rubrique> findRubriqueEnseignant(int id);

}
