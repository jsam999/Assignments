package com.comparator;

import java.util.Comparator;

import com.model.Person;

public class PersonHobbyComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getHobby().compareTo(o2.getHobby());
	}

}
