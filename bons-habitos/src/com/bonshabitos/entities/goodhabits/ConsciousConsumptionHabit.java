package com.bonshabitos.entities.goodhabits;

import java.util.List;

import com.bonshabitos.enums.Theme;

public class ConsciousConsumptionHabit extends GoodHabit {

	public ConsciousConsumptionHabit() {
		super(Theme.CONSUMO_CONSCIENTE);
	}

	public ConsciousConsumptionHabit(List<String> attitudes, List<String> suggestions) {
		super(Theme.CONSUMO_CONSCIENTE, attitudes, suggestions);
	}

}
