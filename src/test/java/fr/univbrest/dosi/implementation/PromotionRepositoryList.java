package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repository.PromotionRepository;

public class PromotionRepositoryList implements PromotionRepository {

	private List<Promotion> promotions;
	
	public PromotionRepositoryList() {
		promotions = new ArrayList<>();
    }
	
	
	@Override
	public <S extends Promotion> S save(S entity) {
		// TODO Auto-generated method stub
		promotions.add(entity);
		
		return entity;
	}

	@Override
	public <S extends Promotion> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Promotion findOne(PromotionPK id) {
		// TODO Auto-generated method stub
		for (Promotion promo : promotions ) {
			
			if (promo.getId() == id) {
				return promo;	
			}	
		}
		return null;
	}

	@Override
	public boolean exists(PromotionPK id) {
		// TODO Auto-generated method stub

		return (promotions.contains(id)?true:false);
	}

	@Override
	public Iterable<Promotion> findAll() {
		// TODO Auto-generated method stub
		return promotions;
	}

	@Override
	public Iterable<Promotion> findAll(Iterable<PromotionPK> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(PromotionPK id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Promotion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Promotion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Promotion> findAllPromotionByCodeFormation(String idFormation) {
		// TODO Auto-generated method stub
		return null;
	}

}
