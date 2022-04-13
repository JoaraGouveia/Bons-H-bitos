package com.bonshabitos.services;

import com.bonshabitos.interfaces.Validator;
import com.bonshabitos.utils.Formatter;

public class CpfValidator implements Validator {

	@Override
	public boolean validate(String identifier) {
		
		identifier = Formatter.formatCpf(identifier);
		int resto;
		if (identifier.length() != 11) {
			return false;
		} else {
			String vetor[] = identifier.split("");
			int contador = 11;
			int soma = 0;
			for (int i = 0; i < 9; i++) {
				soma += Integer.parseInt(vetor[i]) * (contador - 1);
				contador--;
			}
			resto = soma * 10 % 11;
			if (resto == 10) {
				resto = 0;
			}
			if (resto != Integer.parseInt(vetor[9])) {
				return false;
			}

			contador = 12;
			soma = 0;
			for (int i = 0; i < 10; i++) {
				soma += Integer.parseInt(vetor[i]) * (contador - 1);
				contador--;
			}
			resto = soma * 10 % 11;
			if (resto == 10) {
				resto = 0;
			}

			if (resto != Integer.parseInt(vetor[10])) {
				return false;
			}

		}

		return true;

	}

}
