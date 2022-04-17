package com.tutorial.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tutorial.entity.Tutorial;


@Service
public class TutorialServiceImpl implements TutorialService {
	
	List<Tutorial> list;
	
	public TutorialServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Tutorial(121, "Java Tutorial", "This tutorial for begineer", "Active"));
		list.add(new Tutorial(122, "Python Tutorial", "This tutorial for begineer", "Active"));
	}

	@Override
	public List<Tutorial> getTutorial() {
		return list;
	}

	@Override
	public Tutorial getTutorial(long tutorialId) {
		Tutorial t = null;
		
		for (Tutorial tutorial:list)
		{
			if(tutorial.getId()== tutorialId) {
				t = tutorial;
				break;
			}
		}
		return t;
	}

	@Override
	public Tutorial addTutorial(Tutorial tutorial) {
		list.add(tutorial);
		return tutorial;
	}

	@Override
	public Tutorial updateTutorial(Tutorial tutorial) {
		list.forEach(e -> {
			if(e.getId() == tutorial.getId()) {
				e.setTitle(tutorial.getTitle());
				e.setDescription(tutorial.getDescription());
			}
		});
		return tutorial;
	}

	@Override
	public void deleteTutorial(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

}
