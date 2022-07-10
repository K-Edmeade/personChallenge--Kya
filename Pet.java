package com.qa.personchallenge;

public class Pet {

	public String petType;
	public int petAge;
	public String petName;
	
	public Pet() {
		
	}

	public Pet(String petType, int petAge, String petName) {
		super();
		this.petType = petType;
		this.petAge = petAge;
		this.petName = petName;
	}

	@Override
	public String toString() {
		return "\nPets| Pet type: " + petType + "| Pet age: " + petAge + "| Pet name:" + petName;
	};
	
	
	
}
