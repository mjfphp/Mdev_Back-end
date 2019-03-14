package fr.univbrest.dosi.repository;

import java.util.List;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;

@Repository
public interface FormationRepository extends CrudRepository<Formation, String> {
	
	List<Promotion> PromotionByFormation(String idFormation);
}
