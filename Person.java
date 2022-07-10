package com.qa.personchallenge;

import java.util.ArrayList;
import java.util.List;

public class Person {
     
	//Attributes
	public String name;
     public int age;
     public String jobTitle;
     public List<Pet> pets = new ArrayList<>(); 
	
    //to string
    @Override
	public String toString() {
		return "Person:" + "\n" + "Name is " + name 
				+ "| Age is " + age + "| Job Title is " + jobTitle +
				"\n\n" + pets + "\n";
	}
	
	//constructors
	
	

	public Person() {
		
	};
	
	
	public Person(String name, int age, String jobTitle, List<Pet> pets) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.pets = pets;
	}

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

    // Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
     
	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public void addPets(Pet pet) {
		this.pets.add(pet);
	}
	public void quickAddPets(String typePets, int petAge, String petName) {
		Pet pet = new Pet(typePets, petAge, petName);
		this.pets.add((Pet) pets);
		}
     
	
     
}
