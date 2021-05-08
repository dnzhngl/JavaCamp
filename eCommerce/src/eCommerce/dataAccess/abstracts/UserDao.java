package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	User getById(int id);
	User getByMail(User user);
	void activateUser(User user);
}
