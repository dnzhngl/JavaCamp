package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	User getByMail(User user);
	void activateUser(User user);
}
