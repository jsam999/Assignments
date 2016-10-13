package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Person;

public class SortPersonMultipleFields {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		Person person = new Person();
		person.setAge(12);
		person.setHobby("cricket");
		person.setName("sam");
		person.setSalary(1236.09);
		
		Person person1 = new Person();
		person1.setAge(55);
		person1.setHobby("football");
		person1.setName("pankaj");
		person1.setSalary(132.09);
		
		Person person2 = new Person();
		person2.setAge(23);
		person2.setHobby("paint");
		person2.setName("dipti");
		person2.setSalary(121.09);
		
		Person person3 = new Person();
		person3.setAge(89);
		person3.setHobby("golf");
		person3.setName("amir");
		person3.setSalary(36.09);
		
		persons.add(person);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		/*Collections.sort(persons, new PersonComparator(
				new PersonNameComparator(),
				new PersonAgeComparator()
				));*/
		
		Collections.sort(persons, new PersonComparator(
                new PersonNameComparator(),
                new PersonAgeComparator(),
                new PersonSalaryComarator(),
                new PersonHobbyComparator()
                )
        );
		
		
		for (Person person4 : persons) {
			System.out.println("person :"+person4.toString());
		}
		
		
	}

}
