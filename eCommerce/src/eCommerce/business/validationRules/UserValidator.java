package eCommerce.business.validationRules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.entities.concretes.User;

public class UserValidator {
	
	public boolean checkIfPasswordValid(User user) {
		var password = user.getPassword();
		if(password.length() < 6) {
			return false;
		}
		return true;
	}
	
	public boolean checkIfEmailValid(User user) {
		String regex =  "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		
		var email = user.getEmail();
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public boolean checkIfFullNameValid(User user) {
		if(user.getFirstname().length() > 2 && user.getLastname().length() > 2){
			return true;
		}
		return false;
	}
	
}
