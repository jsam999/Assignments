package com.comparator;

import java.util.Comparator;

import com.model.Person;

public class PersonSalaryComarator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
