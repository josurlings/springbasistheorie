package be.vdab.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import be.vdab.restclients.KoersenClient;

@Service
public class EuroService 
{
	private KoersenClient koersenClient; 
	
//	public EuroService(KoersenClient koersenClient) 
	public EuroService(@Qualifier("Yahoo") KoersenClient koersenClient) 
	{ 
		this.koersenClient = koersenClient;
	}
	
	public BigDecimal naarDollar(BigDecimal euro)
	{
		System.out.println(koersenClient.getDollarKoers());
		return euro.multiply(koersenClient.getDollarKoers())
				.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
/*		
	@Autowired
	public void setKoersenClient(@Qualifier("ECB") KoersenClient koersenClient) 
	{
	this.koersenClient = koersenClient;
	}
*/	
	
}
