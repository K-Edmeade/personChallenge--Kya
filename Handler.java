package com.qa.personchallenge;

import java.util.ArrayList;
import java.util.List;

public class Handler {
	
	List<Person> personList = new ArrayList<>();
	
	public Handler() {
	}

	public Handler(List<Person> personList) {
		this.personList = personList;
	}
	
	
	public void addPeople(Person person) {
		this.personList.add(person);
	}
	
	public void removePeople(Person people) {
		this.personList.remove(people);
	}
	
	public Person returnFromName(String name){
 	   for(Person p : personList){
 		   if(p.getName().equalsIgnoreCase(name)) {
 			   return p;
 		   }
 	   }
 	   System.out.println("there is no one with the name :" + name);
 	   return null; 
}
	public void printAll(){
	for (Person p : personList) {
		System.out.println(p);}
	}

	public void addPeople(String string, int i, String string2) {
		// TODO Auto-generated method stub
		
	}
	
}

