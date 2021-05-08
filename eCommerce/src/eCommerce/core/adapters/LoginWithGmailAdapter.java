package eCommerce.core.adapters;

import eCommerce.entities.concretes.User;
import loginWithGmail.LoginWithGmail;

public class LoginWithGmailAdapter implements LoginService {

	private LoginWithGmail loginWithGmail;
	
	public LoginWithGmailAdapter() {
		this.loginWithGmail = new LoginWithGmail();
	}


	@Override
	public boolean login(User user) {
		return loginWithGmail.login(user.getEmail(), user.getPassword());
	}

}
