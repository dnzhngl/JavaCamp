package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	private List<User> userList;
	public InMemoryUserDao() {
		this.userList = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		this.userList.add(user);
		System.out.println("The user account has been created.");
	}

	@Override
	public void delete(User user) {
		this.userList.remove(user);
		System.out.println("The user account has been removed.");
	}

	@Override
	public User getById(int id) {
		return this.userList.stream().filter(p -> p.getId() == id).collect(Collectors.toList()).get(0);
	}

	@Override
	public User getByMail(User user) {
		return this.userList.stream().filter(u -> u.getEmail().equals(user.getEmail())).findAny().orElse(null); 
	}

	@Override
	public void activateUser(User user) {
		User userToActivate = userList.stream().filter(p -> p.getId() == user.getId()).findFirst().orElseThrow();
		userToActivate.setActive(true);
	}
}
