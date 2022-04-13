package com.bonshabitos.entities;

import com.bonshabitos.enums.Gender;

public class Person extends User {

	private int age;
	private String cpf;
	private Gender gender;

	public Person() {
		super();
	}

	public Person(String name, int age, String email, String cpf, Gender gender) {
		super.setName(name);
		this.age = age;
		super.setEmail(email);
		this.cpf = cpf;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	private String translateGender() {
		switch (gender) {

		case MALE_CISGENDER:
			return "Homem cis";
		case MALE_TRANSGENDER:
			return "Homem trans";
		case FEMALE_CISGENDER:
			return "Mulher cis";
		case FEMALE_TRANSGENDER:
			return "Mulher trans";
		case NON_BINARY:
			return "N�o-bin�rio";
		case OTHERS:
			return "outros";
		}
		return "N�o informado";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + getName());
		sb.append("\nIdade: " + age);
		sb.append("\nG�nero: " + translateGender());
		sb.append("\nCPF: " + cpf);
		sb.append("\nE-mail: " + getEmail());
		sb.append("\nN� de atitudes: " + getScore());

		return sb.toString();
	}

}
