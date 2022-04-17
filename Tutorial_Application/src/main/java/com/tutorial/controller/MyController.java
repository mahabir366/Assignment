package com.tutorial.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.entity.Tutorial;
import com.tutorial.service.TutorialService;

@RestController
public class MyController {

	@Autowired
	private TutorialService tutorialservice;

	// Create New Tutorial
	@PostMapping("/tutorial")
	public Tutorial addTutorial(@RequestBody Tutorial tutorial) {
		return this.tutorialservice.addTutorial(tutorial);
	}

	// Get all tutorial
	@GetMapping("/tutorial")
	public List<Tutorial> getTutorials() {
		return this.tutorialservice.getTutorial();
	}

	// Get tutorial by Id
	@GetMapping("/tutorial/{tutorialId}")
	public Tutorial getTutorial(@PathVariable String tutorialId) {
		return this.tutorialservice.getTutorial(Long.parseLong(tutorialId));
	}

	@PutMapping("/tutorial")
	public Tutorial updateTutorial(@RequestBody Tutorial tutorial) {
		return this.tutorialservice.updateTutorial(tutorial);
	}

	@DeleteMapping("/tutorial/{tutorialId}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable String tutorialId) {
		try {
			this.tutorialservice.deleteTutorial(Long.parseLong(tutorialId));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
