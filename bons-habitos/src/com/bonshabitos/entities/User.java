package com.bonshabitos.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bonshabitos.entities.goodhabits.GoodHabit;
import com.bonshabitos.enums.Theme;

public abstract class User {

	private static int ID_COUNTER = 0;

	private int id;
	private String name;
	private String email;
	private int score = 0;
	private List<GoodHabit> goodHabits = new ArrayList<>();

	public User() {
		id = ID_COUNTER++;
	}

	public User(String name) {
		this.name = name;
		id = ID_COUNTER++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGoodHabits(List<GoodHabit> goodHabits) {
		this.goodHabits = goodHabits;
	}

	public List<GoodHabit> getGoodHabits() {
		return goodHabits;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String extractFirstName() {
		if (name.indexOf(" ") != -1) {
			return name.substring(0, name.indexOf(" "));
		}

		return name;
	}

	public boolean hasGoodHabit(GoodHabit goodHabit) {
		for (int i = 0; i < getGoodHabits().size(); i++) {
			if (goodHabit.getTheme().equals(getGoodHabits().get(i).getTheme())) {
				return true;
			}
		}
		return false;
	}

	public GoodHabit findGoodHabit(GoodHabit gh, Theme theme) {
		return gh = getGoodHabits().stream().filter(x -> x.getTheme().equals(theme)).collect(Collectors.toList())
				.get(0);
	}

	public int findAttitude(GoodHabit gh, String attitude) {
		return findGoodHabit(gh, gh.getTheme()).getAttitudes().indexOf(attitude);
	}

}
