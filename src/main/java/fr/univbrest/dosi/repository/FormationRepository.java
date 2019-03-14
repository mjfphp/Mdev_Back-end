package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Etudiant;

@Repository
public interface FormationRepository extends CrudRepository<Etudiant, String> {
}
