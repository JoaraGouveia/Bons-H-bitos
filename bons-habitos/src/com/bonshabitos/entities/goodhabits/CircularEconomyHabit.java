package com.bonshabitos.entities.goodhabits;

import java.util.List;

import com.bonshabitos.enums.Theme;

public class CircularEconomyHabit extends GoodHabit {

	public CircularEconomyHabit() {
		super(Theme.ECONOMIA_CIRCULAR);
	}

	public CircularEconomyHabit(List<String> attitudes, List<String> suggestions) {
		super(Theme.ECONOMIA_CIRCULAR, attitudes, suggestions);
	}

}
