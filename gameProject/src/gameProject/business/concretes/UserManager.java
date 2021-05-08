package gameProject.business.concretes;

import gameProject.business.abstracts.UserService;
import gameProject.entities.User;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
		System.out.println("You have been registered." + user.getEmail());
	}

	@Override
	public void login(User user) {
		System.out.println("Successfull login" + user.getEmail());
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println("The account has been deleted.");
	}

	@Override
	public void update(User user) {
		System.out.println("The account has been updated.");
	}
	
}
