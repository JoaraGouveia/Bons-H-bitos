package com.bonshabitos.entities;

import java.util.Comparator;

public class PersonByAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return Integer.valueOf(p1.getAge()).compareTo(p2.getAge());
	}

	
}
