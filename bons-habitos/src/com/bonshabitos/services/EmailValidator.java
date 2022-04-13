package com.bonshabitos.services;

import com.bonshabitos.interfaces.Validator;
import com.bonshabitos.utils.Formatter;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String identifier) {

		if (!(identifier.contains("@") && identifier.contains(".") && !identifier.contains(" "))) {
			return false;
		}

		if ((char) identifier.charAt(0) == '@') {
			return false;
		}
		String user = identifier.substring(0, identifier.indexOf("@"));
		if (user.length() <= 0) {

			return false;
		}

		String domain = identifier.substring(identifier.indexOf("@") + 1);
		
		if(domain.indexOf(".") == 0) {
			return false;
		}

		if (domain.lastIndexOf(".") >= domain.length() - 1 || domain.substring(0, domain.indexOf(".")).length() < 3) {

			return false;
		}

		return true;

	}

}
