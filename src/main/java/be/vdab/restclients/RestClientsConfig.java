package be.vdab.restclients;

//import java.io.IOException;
//import java.io.InputStream;
import java.net.URL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:be/vdab/restclients/restclients.properties")
public class RestClientsConfig 
{
	
	/*
	@Bean 
	KoersenClient koersenClient(@Value("${ecbKoersenURL}") URL url) 
	{ 
	return new ECBKoersenClient(url);
	}
	
	
	@Bean
	KoersenClient koersenClient(@Value("${yahooKoersenURL}") URL yahooURL,
	@Value("${ecbKoersenURL}") URL ecbURL)
	{
	try (InputStream stream = yahooURL.openStream())
	{ 
	return new YahooKoersenClient(yahooURL); 
	}
	catch (IOException ex)
	{
	return new ECBKoersenClient(ecbURL); 
	}
	}	
	*/
	@Bean
	@Qualifier("ECB")
	ECBKoersenClient ecbKoersenClient(@Value("${ecbKoersenURL}") URL url) {
	return new ECBKoersenClient(url);
	}
	@Bean
	@Qualifier("Yahoo")
	YahooKoersenClient yahooKoersenClient(@Value("${yahooKoersenURL}") URL url) {
	return new YahooKoersenClient(url);
	}
	
	
	
}

