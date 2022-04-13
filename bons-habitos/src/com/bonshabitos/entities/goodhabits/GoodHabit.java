package com.bonshabitos.entities.goodhabits;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.bonshabitos.enums.Theme;

public abstract class GoodHabit {

	private Theme theme;
	private List<String> attitudes = new ArrayList<>();
	private List<String> suggestions = new ArrayList<>();

	public GoodHabit() {
	}
	
	public GoodHabit(Theme theme) {
		this.theme = theme;
	}

	public GoodHabit(Theme theme, List<String> attitudes, List<String> suggestions) {
		super();
		this.theme = theme;
		this.attitudes = attitudes;
		this.suggestions = suggestions;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public List<String> getAttitudes() {
		return attitudes;
	}

	public List<String> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(List<String> suggestions) {
		this.suggestions = suggestions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(theme);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodHabit other = (GoodHabit) obj;
		return theme == other.theme;
	}

}
