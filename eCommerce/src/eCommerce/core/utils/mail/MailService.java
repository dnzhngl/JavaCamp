package eCommerce.core.utils.mail;

public interface MailService {
	void send(Mail mail);
	Mail generateMail(String from, String to, String title,  String body);
}
