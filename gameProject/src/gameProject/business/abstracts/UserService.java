package gameProject.business.abstracts;

import gameProject.entities.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void deleteAccount(User user);
	void update(User user);
}
