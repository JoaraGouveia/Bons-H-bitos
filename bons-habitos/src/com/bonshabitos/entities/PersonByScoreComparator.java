package com.bonshabitos.entities;

import java.util.Comparator;

public class PersonByScoreComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return Integer.valueOf(p1.getScore()).compareTo(p2.getScore());
	}

	
}
