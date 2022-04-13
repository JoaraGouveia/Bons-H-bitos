package com.bonshabitos.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");

		try {

			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido! Apenas algarismos entre 1 e 9.");
			System.out.println(choice > 9);
		}
		if (choice > 9) {
			System.out.println(choice);
			System.out.println("Aqui");
		}

	}

}
