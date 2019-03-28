package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Rubrique;

@Repository
public interface RubriqueRepository extends CrudRepository<Rubrique, String> {

}
