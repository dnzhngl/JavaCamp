package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void loginWithSso(User user);
	void register(User user);
	boolean isUserExists(User user);
}
