package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.validationRules.UserValidator;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		UserValidator userValidator = new UserValidator();
		
		if(!(userValidator.checkIfEmailValid(user) && userValidator.checkIfPasswordValid(user) && userValidator.checkIfFullNameValid(user))) {
			System.out.println("User information is invalid.");
			return;
		}
		userDao.add(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User getByMail(User user) {
		return userDao.getByMail(user);
	}

	@Override
	public void activateUser(User user) {
		userDao.activateUser(user);
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

}
