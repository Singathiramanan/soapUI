package apipgm;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Crycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryInfoService c=new CountryInfoService();
		CountryInfoServiceSoapType a1 = c.getCountryInfoServiceSoap();
		System.out.println(a1.capitalCity("IN"));
		System.out.println(a1.countryFlag("IN"));
	}

}
