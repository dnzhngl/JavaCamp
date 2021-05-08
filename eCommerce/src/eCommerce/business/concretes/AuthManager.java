package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.adapters.LoginService;
import eCommerce.core.utils.accountActivator.AccountActivationService;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;
	private AccountActivationService accountActivationService;
	private LoginService loginService;
	
	public AuthManager(UserService userService, AccountActivationService accountActivationService, LoginService loginService ) {
		this.userService = userService;
		this.accountActivationService = accountActivationService;
		this.loginService = loginService;
	}
	

	@Override
	public void login(User user) {
		if(!isUserExists(user)) {
			System.out.println("The user is not found. Check your email and password.");
			return;
		}
		System.out.println("Login successful.");
	}
	
	@Override
	public void loginWithSso(User user) {
		if(loginService.login(user)){
			if(!isUserExists(user)) {
				userService.add(user);
			}
		}
	}

	@Override
	public void register(User user) {
		if(isUserExists(user)) {
			System.out.println("The user is already registered.");
			return;
		}
		userService.add(user);
		
		accountActivationService.sendActivationCode(user.getEmail());
		userService.activateUser(user);
	}

	@Override
	public boolean isUserExists(User user) {
		if(userService.getByMail(user) != null) {
			return true;
		}
		return false;
	}

}
