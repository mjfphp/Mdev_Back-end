package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.implementation.PromotionRepositoryList;

@RunWith(SpringJUnit4ClassRunner.class)
public class PromotionRepositoryTest {

	@Test
	public void testListPromotion() {
		PromotionRepositoryList promotionRep = new PromotionRepositoryList();
		PromotionPK pk = new PromotionPK("2018-2019", "test");
		Promotion p = new Promotion(pk, "test", "test");
		promotionRep.save(p);
		List<Promotion> list = (List<Promotion>) promotionRep.findAll();
		assertThat(list).hasSize(1);

	}

	@Test
	public void testFindPromotionByID() {
		PromotionRepositoryList promotionRep = new PromotionRepositoryList();
		PromotionPK pk = new PromotionPK("2018-2019", "test");
		Promotion p = new Promotion(pk, "test", "test");
		promotionRep.save(p);
		List<Promotion> list = (List<Promotion>) promotionRep.findAll();
		assertThat(list).hasSize(1);
		Promotion p1 = promotionRep.findOne(pk);
		assertThat(p1.getLieuRentree()).isEqualTo("test");
		assertThat(p1.getSiglePromotion()).isEqualTo("test");

	}

	
}
