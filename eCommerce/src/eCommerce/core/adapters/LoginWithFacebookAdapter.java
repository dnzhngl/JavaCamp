package eCommerce.core.adapters;

import eCommerce.entities.concretes.User;
import loginWithFacebook.LoginWithFacebook;

public class LoginWithFacebookAdapter implements LoginService{

	private LoginWithFacebook loginWithFacebook;
	
	public LoginWithFacebookAdapter() {
		this.loginWithFacebook = new LoginWithFacebook();
	}

	@Override
	public boolean login(User user) {
		return loginWithFacebook.login(user.getEmail(), user.getPassword());
	}
	
	
}
