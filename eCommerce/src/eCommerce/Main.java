package eCommerce;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.adapters.LoginWithGmailAdapter;
import eCommerce.core.utils.accountActivator.AccountActivationManager;
import eCommerce.core.utils.mail.MailManager;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		
		
		UserManager userManager = new UserManager(new InMemoryUserDao());
		AccountActivationManager accountActivation = new AccountActivationManager(new MailManager());
		LoginWithGmailAdapter loginWithGmail = new LoginWithGmailAdapter();
		AuthManager authManager = new AuthManager(userManager, accountActivation, loginWithGmail);
		
		User user = new User(1, "Ahmet", "Tas", "ahmet.tas@gmail.com", "123456", false);
		
		
		authManager.register(user);		
		accountActivation.readActivationCode();
		
		authManager.loginWithSso(user);
		authManager.login(user);

	}


}
