package com.bonshabitos.entities.goodhabits;

import java.util.List;

import com.bonshabitos.enums.Theme;

public class FoodHabit extends GoodHabit {

	public FoodHabit() {
		super(Theme.ALIMENTACAO);
	}

	public FoodHabit(List<String> attitudes, List<String> suggestions) {
		super(Theme.ALIMENTACAO, attitudes, suggestions);
	}

}
