package com.qa.personchallenge;


public class Runner {
	public static void main(String[] args) {
		Handler newList = new Handler();
		
		Person personOne = new Person ("Kya", 23, "Java developer");
		Person personTwo = new Person ("Luke", 28, "Model");
		Person personThree = new Person ("Jayson", 24, "Basketball player");
		Person personFour = new Person ("Israel", 32, "Fighter");
		Person personFive = new Person ("Paul", 47, "Truck Driver");
		Person personSix = new Person ("Mark", 57, "Doctor");
		
		newList.addPeople(personOne);
		newList.addPeople(personTwo);
		newList.addPeople(personThree);
		newList.addPeople(personFour);
		newList.addPeople(personFive);
		
		
		
		
		
		System.out.println(newList.returnFromName("Israel"));
	    Pet petOne = new Pet ("Okami", 2, "Shiba inu");
	    Pet petTwo = new Pet ("Dougie", 4, "Springer");
	    Pet petThree = new Pet ("Dobby", 6, "Doberman");
	    Pet petFour = new Pet ("Rocco", 5, "Rottweiler");
	    Pet petFive = new Pet ("Tiger", 14, "Tabby Cat");
	    Pet petSix = new Pet ("Dana", 10, "Great Dane");
	    Pet petSeven = new Pet ("Kane", 2, "Cane Corso");
	    
	    personTwo.addPets(petOne);
	    personOne.addPets(petThree);
	    personOne.addPets(petFour);
	    personOne.addPets(petFive);
	    personOne.addPets(petSix);
	    personOne.addPets(petSeven);
	    personSix.addPets(petTwo);
	    newList.printAll();
	    }
	
	    
	    
}
