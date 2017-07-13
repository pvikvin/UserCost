package com.gemicle.usercost.test;

import org.junit.Test;

import com.gemicle.usercost.pojo.Purse;
import com.gemicle.usercost.pojo.User;
import com.gemicle.usercost.service.PurseService;

public class PurseServiceTest {
	
	private PurseService purseService = new PurseService();
	
	@Test
	public void TransferMoneyTest(){
		
		Purse purse = new Purse();
		purse.setCoins(70);
		purse.setDollars(100);
		purse.setId(purseService.save(purse));
		
		User user = new User();
		user.setName("User1");
		user.setPurse(purse);
		
		user.setId(purseService.save(user));
		
	}
}
