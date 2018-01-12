package com.au.soapAss.com;

import java.util.HashMap;

import javax.jws.WebService;

@WebService(endpointInterface="com.au.soapAss.com.FootballPool")
public class FootballPoolImpl implements FootballPool{
	
	HashMap<Integer,Player> hm=new HashMap<Integer,Player>();  
	  
	
	@Override
	public void deletePlayer(int pId) {
		
		hm.remove(pId);		
	}

	@Override
	public Player modifyNewPlayer(int pId, String name, String country, int numOfGoals) {
		hm.remove(pId);
		Player newPlayer = new Player();
		newPlayer.setpId(pId);
		newPlayer.setCountry(country);
		newPlayer.setName(name);
		newPlayer.setNumOfGoals(numOfGoals);
		hm.put(pId,newPlayer);
		return newPlayer;
		
	}

	@Override
	public void createNewPlayer(int pId, String name, String country, int numOfGoals) {
		Player newPlayer = new Player();
		newPlayer.setpId(pId);
		newPlayer.setCountry(country);
		newPlayer.setName(name);
		newPlayer.setNumOfGoals(numOfGoals);
		hm.put(pId,newPlayer);
	}

	@Override
	public Player getPlayerById(int id) {
		return hm.get(id);
	}

}
