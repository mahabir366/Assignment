package com.tutorial.entity;

public class Tutorial {
	

	private long id;
	private String title;
	private String description;
	private String published_status;
	
	public Tutorial(long id, String title, String description, String published_status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.published_status = published_status;
	}

	public Tutorial() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublished_status() {
		return published_status;
	}

	public void setPublished_status(String published_status) {
		this.published_status = published_status;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published_status="
				+ published_status + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDescription()="
				+ getDescription() + ", getPublished_status()=" + getPublished_status() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
}
