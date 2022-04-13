package com.bonshabitos.utils;

public class Formatter {

	public static String formatName(String str) {

		str = str.replaceAll("\\s+", " ");
		String[] splitStr = str.split(" ");
		String[] formattedName = new String[splitStr.length];

		for (int i = 0; i < splitStr.length; i++) {
			splitStr[i] = splitStr[i].replaceAll("\\s+", "");
			formattedName[i] = splitStr[i].substring(0, 1).toUpperCase();
			formattedName[i] += splitStr[i].substring(1).toLowerCase();

		}
		return String.join(" ", formattedName);

	}

	public static String formatCpf(String cpf) {
		return cpf.replaceAll("[^0-9]", "");
	}
}
