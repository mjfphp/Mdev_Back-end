package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.QuestionEvaluation;


public interface QuestionEvaluationBusiness {
	
			//la recuperation de toutes les Quations de la Rubrique
			public List<QuestionEvaluation> GetAllQuestionsEvaluationOnRubrique(long idRubriqueEvaluation);

			//la suppression d'une question de la rebriques par l'Identifiant
			void deleteQuestionEvaluationOnRubrique(long idQuestionEvaluation);

			//la création d'une question dans une Rubrique
			public void createQuestionEvaluationOnRubrique(QuestionEvaluation questionEvaluation);
			
			
			//la modification de l'ordre d'une question dans une rubrique
			public void updateOrderQuestionEvaluationOnRubrique(QuestionEvaluation questionEvaluation);
			


}
