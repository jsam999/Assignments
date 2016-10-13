package com.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.model.Person;

public class PersonComparator implements Comparator<Person>{

	private List<Comparator<Person>> comparatorList;
	
	public List<Comparator<Person>> getListComparators() {
		return comparatorList;
	}

	public void setListComparators(List<Comparator<Person>> listComparators) {
		this.comparatorList = listComparators;
	}

	@SafeVarargs
	public PersonComparator(Comparator<Person>... listComparators) {
		this.comparatorList = Arrays.asList(listComparators);
	}

	@Override
	public int compare(Person p1, Person p2) {
		for (Comparator<Person> comparator : getListComparators()) {
            int result = comparator.compare(p1, p2);
            if (result != 0) {
                return result;
            }
        }
		return 0;
	}
	
	

}
