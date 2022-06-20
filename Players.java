package com.wipro.SpringDemo.players;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Players {

	
	private String playerId;
	private String playerName;
	
	@Autowired
	private Country country;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country pointToCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
