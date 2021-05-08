package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import business.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
			// new Locale("tr","TR")
			
			boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(customer.getNationalId(), customer.getFirstname().toUpperCase(new Locale("tr","TR")), customer.getLastname().toUpperCase(new Locale("tr","TR")), customer.getDob().getYear());
			
			return result;

		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
