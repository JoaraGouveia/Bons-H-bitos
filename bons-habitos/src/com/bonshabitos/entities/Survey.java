package com.bonshabitos.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bonshabitos.utils.Formatter;

public class Survey {

	public static final String PATH = "C:\\java\\projeto1testes";

	private String title;
	private Person author;
	private List<Person> participants = new ArrayList<>();

	public Survey() {
	}

	public Survey(String title, Person author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public List<Person> getParticipants() {
		return participants;
	}

	public int getNumberOfParticipants() {
		return participants.size();
	}

	public int getTotalScore() {
		return participants.stream().mapToInt(x -> x.getScore()).reduce(0, (sum, x) -> sum + x);
	}

	public double getAverageAge() {
		return participants.stream().mapToDouble(x -> x.getAge()).reduce(0,
				(sum, x) -> sum + x / getNumberOfParticipants());
	}

	public List<Person> sortPeopleByParameter(Comparator<Person> comparator) {
		Collections.sort(participants, comparator);

		return participants;
	}

	public void generateSurveyFile() throws IOException {
		String endPath = PATH + "\\" + title.replaceAll(" ", "").toLowerCase() + ".txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(endPath, true));

		bw.write("Nº Participantes: " + getNumberOfParticipants());
		bw.newLine();
		bw.write("Média de idade das pessoas participantes: " + getAverageAge());
		bw.newLine();
		for (Person participant : participants) {
			bw.write(participant.extractFirstName() + "," + Formatter.formatCpf(participant.getCpf()) + "," + participant.getAge() + ","
					+ participant.getGender());
			bw.newLine();
		}
		bw.write("===================");

		bw.close();

	}

}
