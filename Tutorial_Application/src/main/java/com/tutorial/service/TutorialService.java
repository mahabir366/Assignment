package com.tutorial.service;

import java.util.List;

import com.tutorial.entity.Tutorial;

public interface TutorialService {

	public List<Tutorial> getTutorial();
	
	public Tutorial getTutorial(long tutorialId);

	public Tutorial addTutorial(Tutorial tutorial);

	public Tutorial updateTutorial(Tutorial tutorial);

	public void deleteTutorial(long parseLong);
}
