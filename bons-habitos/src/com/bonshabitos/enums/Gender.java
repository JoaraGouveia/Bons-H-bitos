package com.bonshabitos.enums;

public enum Gender {

	MALE_CISGENDER(1), MALE_TRANSGENDER(2), FEMALE_CISGENDER(3), FEMALE_TRANSGENDER(4), NON_BINARY(5), OTHERS(6);

	private int value;

	Gender(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static Gender valueOf(int value) {
		switch (value) {
		case 1:
			return Gender.MALE_CISGENDER;
		case 2:
			return Gender.MALE_TRANSGENDER;
		case 3:
			return Gender.FEMALE_CISGENDER;
		case 4:
			return Gender.FEMALE_TRANSGENDER;
		case 5:
			return Gender.NON_BINARY;
		case 6:
			return Gender.OTHERS;
		}

		return Gender.OTHERS;

	}
}
