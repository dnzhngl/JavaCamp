package eCommerce.core.utils.accountActivator;

import java.util.Random;
import java.util.Scanner;

import eCommerce.core.utils.mail.MailService;

public class AccountActivationManager implements AccountActivationService {

	private String activationCode;
	private MailService mailService;	
	public AccountActivationManager(MailService mailService) {
		this.mailService = mailService;
	}

	@Override
	public void checkActivationCode(String enteredCode) {
        if(!enteredCode.equals(activationCode)) {
        	System.out.println(activationCode + " " + enteredCode);
            System.out.println("The activation code is not matched.");
            readActivationCode();
        }
        System.out.println("Your account has been acivated.");
       	return;
	}

	@Override
	public void sendActivationCode(String email) {
		this.activationCode = generateActivationCode(5);
		
		mailService.send(mailService.generateMail(null, email, "Account Activation", activationCode));
		
		System.out.println("Check your inbox for validation code. - " +  activationCode);
	}

	@Override
	public String generateActivationCode(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
				sb.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		return sb.toString();
	}
	
	@Override
	public void readActivationCode() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the validation code : ");
	    String enteredCode = scan.nextLine();
	    checkActivationCode(enteredCode);
	}

}
