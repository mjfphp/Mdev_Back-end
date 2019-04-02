package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.RubriqueQuestion;
import fr.univbrest.dosi.bean.RubriqueQuestionPK;
import fr.univbrest.dosi.repository.RubriqueQuestionRepository;
@Service
public class RubriqueQuestionBusinessJPA implements RubriqueQuestionBusiness {

	RubriqueQuestionRepository repository;
	
	public RubriqueQuestionBusinessJPA(RubriqueQuestionRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<RubriqueQuestion> GetAllRubriqueQuestions() {
		// TODO Auto-generated method stub
		return (List<RubriqueQuestion>) repository.findAll();
	}

	@Override
	public void deleteRubriqueQuestion(RubriqueQuestionPK rubriqueQuestionPK) {
		repository.delete(rubriqueQuestionPK);

	}

	@Override
	public void createRubriqueQuestion(RubriqueQuestion rubriqueQuestion) {
		// TODO Auto-generated method stub
		repository.CreateRubriqueQuestion(rubriqueQuestion.getRubrique().getIdRubrique(),rubriqueQuestion.getQuestion().getIdQuestion(), rubriqueQuestion.getOrdre());

	}

	@Override
	public void updateRubriqueQuestion(RubriqueQuestion rubriqueQuestion) {
		// TODO Auto-generated method stub
		 repository.UpdateQuestionById(rubriqueQuestion.getRubrique().getIdRubrique(),rubriqueQuestion.getQuestion().getIdQuestion(), rubriqueQuestion.getOrdre());;
	}

}
