package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.repository.QuestionEvaluationRepository;

@Service
public class QuestionEvaluationBusinessJPA implements QuestionEvaluationBusiness {
	
	QuestionEvaluationRepository repository;
	
	@Autowired
	public QuestionEvaluationBusinessJPA(QuestionEvaluationRepository repository) {	
		this.repository = repository;
	}
	
	@Override
	public void deleteQuestionEvaluationOnRubrique(long idQuestionEvaluation) {
		repository.delete(idQuestionEvaluation);

	}

	@Override
	public List<QuestionEvaluation> GetAllQuestionsEvaluationOnRubrique(long idRubriqueEvaluation) {
		// TODO Auto-generated method stub
		return repository.GetAllQuestionsEvaluationOnRubrique(idRubriqueEvaluation);
	}

	@Override
	public void createQuestionEvaluationOnRubrique(QuestionEvaluation questionEvaluation) {
		// TODO Auto-generated method stub
		repository.createQuestionEvaluationOnRubrique(questionEvaluation.getQuestion().getIdQuestion(), questionEvaluation.getOrdre(), questionEvaluation.getIntitule(), questionEvaluation.getQualificatif().getIdQualificatif(), questionEvaluation.getRubriqueEvaluation().getIdRubriqueEvaluation());

	}

	@Override
	public void updateOrderQuestionEvaluationOnRubrique(QuestionEvaluation questionEvaluation) {
		// TODO Auto-generated method stub
		repository.updateOrderQuestionEvaluationOnRubrique(questionEvaluation.getIdQuestionEvaluation(), questionEvaluation.getOrdre());

	}
	

}
