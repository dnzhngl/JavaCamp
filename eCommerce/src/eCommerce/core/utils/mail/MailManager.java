package eCommerce.core.utils.mail;

public class MailManager implements MailService{

	private String from = "info@eCommerce.com";
	
	@Override
	public void send(Mail mail) {
		System.out.println("Mail has been sent to : " + mail.getTo() + ". Check your inbox.");
	}

	@Override
	public Mail generateMail(String from, String to, String title, String body) {
		Mail mail = new Mail(from != null ? from : this.from, to, title, body);
		return mail;
	}



}
