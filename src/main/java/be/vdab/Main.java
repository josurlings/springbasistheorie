package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.restclients.RestClientsConfig;
import be.vdab.services.EuroService;
import be.vdab.services.ServicesConfig;

public class Main
{
	public static void main(String[] args)
	{
		
	/*	
		try (ClassPathXmlApplicationContext context =
	//	new ClassPathXmlApplicationContext("container.xml")) 
		new ClassPathXmlApplicationContext("restclients.xml", "services.xml")) 
		{
	*/
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(
				new Class[] {ServicesConfig.class, RestClientsConfig.class})) 
		{
		
	/*		System.out.println(context.getBean("classA", ClassA.class).getBoodschap());
			System.out.println(context.getBean("classB", ClassB.class).getBoodschap());
			
			System.out.println(context.getBean(ClassA.class).getBoodschap());
			System.out.println(context.getBean(InterfaceB.class).getBoodschap()); 

			ClassA objectA = context.getBean(ClassA.class);
			System.out.println(context.getBean(ClassA.class).getTelefoonNrHelpDesk());
			System.out.println(objectA.getKoersenUrl());
			System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
			System.out.println("Bestand bestaat: " + objectA.getImportData().exists());
			System.out.println(objectA.getDefaultBladRichting());
			System.out.println(objectA.getWebMasterEMailAdres());
			System.out.println(objectA.getWebsiteGestart());
						
			ClassB objectB = context.getBean(ClassB.class);
			System.out.println(objectB.getTelefoonNrHelpDesk());
			System.out.println(objectB.getAantalPogingenUpdateKlant());
			
			HelpdeskMedewerker helpdeskMedewerker = context.getBean(HelpdeskMedewerker.class);
			System.out.println(helpdeskMedewerker.toString());
			
			Teller teller1 = context.getBean("teller1", Teller.class);
			Teller teller2 = context.getBean("teller2", Teller.class);
			teller1.verhoog();
			teller2 = context.getBean("teller2", Teller.class);
			teller1.verhoog();
			teller2.verhoog();
			teller2 = context.getBean("teller2", Teller.class);
			teller2.verhoog();
			
	*/
			System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(2)));
		}
	}
	
}
