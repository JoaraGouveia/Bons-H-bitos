package com.bonshabitos.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bonshabitos.entities.goodhabits.CircularEconomyHabit;
import com.bonshabitos.entities.goodhabits.ConsciousConsumptionHabit;
import com.bonshabitos.entities.goodhabits.FoodHabit;
import com.bonshabitos.entities.goodhabits.GoodHabit;

public class GoodHabitFactory {

	/*
	 * Cada M�TODO dessa classe vai criar um OBJETO da CLASSE GoodHabit e depois vai
	 * retornar esse OBJETO
	 */

	public static GoodHabit createGoodHabitAlimentacao() {
		List<String> attitudes = new ArrayList<>();
		attitudes.add("Sou vegetariano");
		attitudes.add("Deixo de comer carne pelo menos uma vez na semana");
		attitudes.add("Compro alimentos org�nicos");

		List<String> suggestions = new ArrayList<>();
		suggestions.add("Leia Guia Alimentar de Dietas Vegetarianas para Adultos: " + Color.ANSI_CYAN + "www.svb.org.br"
				+ Color.ANSI_RESET);
		suggestions.add("Assista ao document�rio A Carne � Fraca, dispon�vel no seguinte link: " + Color.ANSI_CYAN
				+ "https://www.youtube.com/watch?v=rrFsGTw5bCw" + Color.ANSI_RESET);
		suggestions.add(
				"Escute o epis�dio da s�rie Politicamente Incorreto...e Ambiental Tamb�m, do podcast Modefica, chamado"
						+ Color.ANSI_GREEN + " O Agroneg�cio, Amaz�nia em Chamas e Soberania Nacional"
						+ Color.ANSI_RESET);

		GoodHabit goodHabit = new FoodHabit(attitudes, suggestions);

		return goodHabit;
	}

	public static GoodHabit createGoodHabitEconomiaCircular() {

		List<String> atittudes = Arrays.asList("Compro em brech�s", "Reciclo e reuso",
				"Descarto de maneira adequada ap�s uso");

		List<String> suggestions = new ArrayList<>();
		suggestions.add("D� uma olhada em empresas que s�o adeptas: Natura, L'or�al, Unilever");
		suggestions.add("Segue esses perfis de uns brech�s massa: " + Color.ANSI_PURPLE + Color.ANSI_WHITE_BACKGROUND
				+ "@dprafrente_brecho, @dbs_brecho, @brechodakombi" + Color.ANSI_RESET);
		suggestions.add("Visita o site Enjoei: " + Color.ANSI_CYAN + "https://www.enjoei.com.br/" + Color.ANSI_RESET);

		GoodHabit goodHabit = new CircularEconomyHabit(atittudes, suggestions);

		return goodHabit;
	}

	public static GoodHabit createGoodHabitConsumoConsciente() {

		List<String> atittudes = Arrays.asList("Compro apenas os alimentos que vou consumir/n�o desperdi�o comida;",
				"Uso ecobags", "Uso eletrodom�sticos com alta efici�ncia energ�tica (Selo A - Procel)");
		List<String> suggestions = new ArrayList<>();
		suggestions.add("Assista ao document�rio O Custo Verdadeiro");
		suggestions.add("Assista ao document�rio Obsol�scencia Programada");
		suggestions.add("Da uma olhada no canal do youtube Menos 1 Lixo: " + Color.ANSI_CYAN
				+ "www.youtube.com/c/Menos1LixoOficial" + Color.ANSI_RESET);

		GoodHabit goodHabit = new ConsciousConsumptionHabit(atittudes, suggestions);

		return goodHabit;
	}

}
