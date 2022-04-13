package com.bonshabitos.utils;

import java.util.List;

import com.bonshabitos.entities.Person;
import com.bonshabitos.entities.Survey;
import com.bonshabitos.entities.User;
import com.bonshabitos.entities.goodhabits.GoodHabit;

public class Screen {

	public static void printSurveyResult(String title, Survey survey) {
		
		splitSign("=", 80);
		System.out.printf(Color.ANSI_CYAN + "%40s" + Color.ANSI_RESET, title.toUpperCase());
		System.out.printf("%n%-20s %20s %35s", "NOME", "IDADE", "PONTUAÇÃO");
		splitSign("=", 80);
		for (Person participant : survey.getParticipants()) {
			System.out.printf("%-20s %20s %35s%n", participant.extractFirstName(), participant.getAge(),
					participant.getScore());
		}
		System.out.printf("TOTAL DE PARTICIPANTES: %s", survey.getNumberOfParticipants());
		System.out.printf("%nMÉDIA DE IDADE: %.2f", survey.getAverageAge());
		System.out.printf("%nTOTAL DE PONTOS: %d", survey.getTotalScore());
		splitSign("=", 80);
	}

	public static void printSurveyResultMenu() {
		splitSign("=", 80);
		System.out.print("MENU DE EXIBIÇÃO DOS RESULTADOS");
	
		String[] opcoes = { "1 - Exibir participantes", "2 - Ordenar por idade", "3 - Ordenar por pontuação" };
		for (String opcao : opcoes) {
			splitSign("=", 80);
			System.out.print(opcao);
		}
	}

	public static void printUserGoodHabitsStatus(User user) {
		System.out.println(user);
		for (GoodHabit gh : user.getGoodHabits()) {
			Screen.splitSign("-", 30);
			System.out.print("TEMA: ");
			System.out.print(gh.getTheme());
			Screen.splitSign("-", 30);
			System.out.println("ATIITUDES: ");
			for (String attitude : gh.getAttitudes()) {
				System.out.println(attitude);
			}
			System.out.println("SUGESTÕES: ");
			for (String suggestion : gh.getSuggestions()) {
				System.out.println(suggestion);
			}
			System.out.println("===================");
		}

	}

	public static void printGenderOptions() {
		System.out.println("1- HOMEM-CIS");
		System.out.println("2- HOMEM-TRANS");
		System.out.println("3- MULHER-CIS");
		System.out.println("4- MULHER-TRANS");
		System.out.println("5- NÃO-BINÁRIOS");
		System.out.println("6- OUTROS");
	}

	public static void printGoodHabitsAttitudesList(List<GoodHabit> goodHabits) {
		System.out.println("LISTA DE BONS HÁBITOS: ");

		int c = 0;
		for (int i = 0; i < goodHabits.size(); i++) {
			for (int j = 0; j < goodHabits.get(i).getAttitudes().size(); j++) {
				System.out.println((c + 1) + "- " + goodHabits.get(i).getAttitudes().get(j));
				c++;
				System.out.println();
			}
		}
	}

	public static void printPresentation() {
		System.out.println("Olá! Seja bem vinde à nossa pesquisa sobre atitudes!");
		System.out.println("Nosso objetivo é mapear que atitudes você tem que impactam positivamente o meio ambiente");
		System.out.println(
				"Ah! E de quebra, a gente vai te dar algumas sugestões pra continuar nessa pegada sustentável");
		System.out.println();
		System.out.println("E ai? Quer ver como você se sai?");
		System.out.println("1- Simbora!");
		System.out.println("2- Tô fora...");
	}

	public static void printExplanation() {
		splitSign("-", 40);
		System.out.println("Vai funcionar assim: ");
		System.out.println("Nós vamos te mostrar uma lista de hábitos;");
		System.out.println("Dentre as opções, tu vai escolher quais tu pratica;");
		System.out.println("No final, a gente vai falar emitir teu EXTRATO DE BONS HÁBITOS!");
		splitSign("-", 40);
	}

	public static void splitSign(String str, int amount) {
		System.out.println();
		for (int i = 0; i < amount; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
}
