package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.implementation.FormationRepositoryList;
import fr.univbrest.dosi.implementation.QualificatifRepositoryList;
import fr.univbrest.dosi.repository.FormationRepository;
import fr.univbrest.dosi.repository.QualificatifRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class QualificatifBusinessJPATest extends QualificatifRepositoryList {
	
	QualificatifBusinessJPA qualificatifBusinessJPA;
	
	QualificatifRepository qualificatifRepository = new QualificatifRepositoryList();
	
	Qualificatif q1 = new Qualificatif(1,"Fort","Faible");
	Qualificatif q2 = new Qualificatif(1,"Bien","Mauvais");

	@Test
	private void TestcreateQualificatif() {
		// TODO Auto-generated method stub

	}
	@Test
	private void TestListQualificatif() {
		// TODO Auto-generated method stub
		QualificatifRepository qualificatifRepository = new QualificatifRepositoryList();
		QualificatifBusinessJPA qualificatifBusinessJPA = new QualificatifBusinessJPA(qualificatifRepository);
		qualificatifBusinessJPA.createQualificatif(q1);
		qualificatifBusinessJPA.createQualificatif(q2);
		assertThat(qualificatifRepository.count()).isEqualTo(2);
	}
	
	@Test
	private void TestGetAllQualificatifs() {
		// TODO Auto-generated method stub
		QualificatifRepository qualificatifRepository1 = new QualificatifRepositoryList();
		QualificatifBusinessJPA qualificatifBusinessJPA1 = new QualificatifBusinessJPA(qualificatifRepository1);
		qualificatifBusinessJPA.createQualificatif(q1);
		qualificatifBusinessJPA.createQualificatif(q2);
		assertEquals(qualificatifRepository.count(),2);

	}
	@Test
	private void TestdeleteQualificatif() {
		// TODO Auto-generated method stub

	}
	@Test
	private void TestfindQualificationById() {
		// TODO Auto-generated method stub

	}
	@Test
	private void TestupdateQualificatifById() {
		// TODO Auto-generated method stub

	}
	@Test
	private void TestfindQualificationByMin() {
		// TODO Auto-generated method stub

	}
	
	@Test
	private void TestfindQualificationByMax() {
		// TODO Auto-generated method stub
		

	}
	/* 
	 @Test
    public void testListFormation(){
        FormationRepository formationRepository = new FormationRepositoryList();
    	FormationBusinessJPA formationBusinessJPA = new FormationBusinessJPA(formationRepository, null);
    	formationBusinessJPA.AddFormation(F1);
    	formationBusinessJPA.AddFormation(F2);
        assertThat(formationRepository.count()).isEqualTo(2);
    }
	 * */
	 
}
