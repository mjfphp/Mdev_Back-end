package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Promotion;

@Repository

public interface PromotionRepository extends CrudRepository<Promotion, String>{
	
	

}
