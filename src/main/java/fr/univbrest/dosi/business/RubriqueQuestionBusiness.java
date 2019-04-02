package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.RubriqueQuestion;
import fr.univbrest.dosi.bean.RubriqueQuestionPK;

public interface RubriqueQuestionBusiness {
	
	//la recuperation de toutes les Quations de la Rubrique
		public List<RubriqueQuestion> GetAllRubriqueQuestions();

		//la suppression d'une question de la rebriques par l'Identifiant
		void deleteRubriqueQuestion(RubriqueQuestionPK rubriqueQuestionPK);

		//la création d'une question dans une Rubrique
		public void createRubriqueQuestion(RubriqueQuestion rubriqueQuestion);
		
		
		//la modification de l'ordre d'une question dans une rubrique
		public void updateRubriqueQuestion(RubriqueQuestion rubriqueQuestion);
		


}
