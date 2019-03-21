package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.implementation.QualificatifRepositoryList;
import fr.univbrest.dosi.repository.QualificatifRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class QualificatifBusinessJPATest  {
	
	QualificatifBusinessJPA qualificatifBusinessJPA;
	
	QualificatifRepository qualificatifRepository = new QualificatifRepositoryList();
	
	Qualificatif q1 = new Qualificatif(1,"Fort","Faible");
	Qualificatif q2 = new Qualificatif(1,"Bien","Mauvais");

	@Test
	public void TestcreateQualificatif() {
		// TODO Auto-generated method stub

	}
	@Test
	public void TestListQualificatif() {
		// TODO Auto-generated method stub
		QualificatifRepository qualificatifRepository = new QualificatifRepositoryList();
		QualificatifBusinessJPA qualificatifBusinessJPA = new QualificatifBusinessJPA(qualificatifRepository);
		qualificatifBusinessJPA.createQualificatif(q1);
		qualificatifBusinessJPA.createQualificatif(q2);
		assertThat(qualificatifRepository.count()).isEqualTo(2);
	}
	
	@Test
	public void TestGetAllQualificatifs() {
		// TODO Auto-generated method stub
		QualificatifRepositoryList qualificatifRepository = new QualificatifRepositoryList();
		QualificatifBusinessJPA qualificatifBusinessJPA = new QualificatifBusinessJPA(qualificatifRepository);
		qualificatifBusinessJPA.createQualificatif(q1);
		qualificatifBusinessJPA.createQualificatif(q2);
		assertEquals(qualificatifRepository.count(),2);
 
	}
	
	@Test
	public void TestdeleteQualificatif() {
		// TODO Auto-generated method stub
		QualificatifRepositoryList qualificatifRepository = new QualificatifRepositoryList();
		QualificatifBusinessJPA qualificatifBusinessJPA = new QualificatifBusinessJPA(qualificatifRepository);
		qualificatifBusinessJPA.createQualificatif(q1);
		qualificatifBusinessJPA.deleteQualificatif(q1.getIdQualificatif());
		Qualificatif q = qualificatifBusinessJPA.findQualificationById(q1.getIdQualificatif());
		assertNull(q);
		}
	
	
	@Test
	public void TestfindQualificationById() {
		// TODO Auto-generated method stub

	}
	@Test
	public void TestupdateQualificatifById() {
		// TODO Auto-generated method stub

	}
	@Test
	public void TestfindQualificationByMin() {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void TestfindQualificationByMax() {
		// TODO Auto-generated method stub
		

	}

	 
}
