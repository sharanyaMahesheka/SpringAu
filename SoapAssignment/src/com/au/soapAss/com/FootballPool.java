package com.au.soapAss.com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface FootballPool {
	
	@WebMethod
	public void createNewPlayer(int pId,String name ,String country, int numOfGoals);
	
	@WebMethod
	public void deletePlayer(int pId);
	
	@WebMethod
	public Player modifyNewPlayer(int pId,String name ,String country, int numOfGoals);
	
	@WebMethod
	public Player getPlayerById(int id);

}
