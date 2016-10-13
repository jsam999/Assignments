package com.comparator;

import java.util.Comparator;

import com.model.Person;

public class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
