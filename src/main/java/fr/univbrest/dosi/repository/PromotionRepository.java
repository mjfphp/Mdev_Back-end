package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;

@Repository

public interface PromotionRepository extends CrudRepository<Promotion, PromotionPK>{
	
	@Query(value = "select * from promotion where code_formation = ?1", nativeQuery = true)
	List<Promotion> findAllPromotionByCodeFormation(String idFormation);
}
