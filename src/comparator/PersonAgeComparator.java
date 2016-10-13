package com.comparator;

import java.util.Comparator;

import com.model.Person;

public class PersonAgeComparator implements Comparator<Person>{

	
	
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge().compareTo(o2.getAge());
	}

}
