package eCommerce.core.utils.accountActivator;

public interface AccountActivationService {
	
	void checkActivationCode(String enteredCode);

	void sendActivationCode(String email);

	String generateActivationCode(int len);
	
	void readActivationCode();
}
