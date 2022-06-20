package com.wipro.SpringDemo.players;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfig.class);
		Players initTheMap = context.getBean(Players.class);
		Players pl = context.getBean(Players.class);
		Players pl2 = context.getBean(Players.class);
		Players pl3 = context.getBean(Players.class);
		Players pl4 = context.getBean(Players.class);
		Players pl5 = context.getBean(Players.class);
		
		initTheMap.pointToCountry().setCountryDetails("C001", "Argentina");
		initTheMap.pointToCountry().setCountryDetails("C002", "Portugal");
		
		pl.setPlayerId("P001");
		pl.setPlayerName("Messi");
		pl.pointToCountry().setCountryName("C001");
		
		pl2.setPlayerId("P002");
		pl2.setPlayerName("Mossedigi");
		pl2.pointToCountry().setCountryName("C001");
		
		pl3.setPlayerId("P003");
		pl3.setPlayerName("Vanhall");
		pl3.pointToCountry().setCountryName("C002");
		
		pl4.setPlayerId("P004");
		pl4.setPlayerName("Ronaldo");
		pl4.pointToCountry().setCountryName("C002");
		
		pl5.setPlayerId("P005");
		pl5.setPlayerName("Palzhar");
		pl5.pointToCountry().setCountryName("C002");
		
		System.out.println("Player ID: "+pl.getPlayerId());
		System.out.println("Player Name: "+pl.getPlayerName());
		System.out.println("Player Country Name: "+pl.pointToCountry().getCountryName());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Player ID: "+pl2.getPlayerId());
		System.out.println("Player Name: "+pl2.getPlayerName());
		System.out.println("Player Country Name: "+pl2.pointToCountry().getCountryName());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Player ID: "+pl3.getPlayerId());
		System.out.println("Player Name: "+pl3.getPlayerName());
		System.out.println("Player Country Name: "+pl3.pointToCountry().getCountryName());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Player ID: "+pl4.getPlayerId());
		System.out.println("Player Name: "+pl4.getPlayerName());
		System.out.println("Player Country Name: "+pl4.pointToCountry().getCountryName());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Player ID: "+pl5.getPlayerId());
		System.out.println("Player Name: "+pl5.getPlayerName());
		System.out.println("Player Country Name: "+pl5.pointToCountry().getCountryName());
		System.out.println("--------------------------------------------------------");
		
		
	}
}
