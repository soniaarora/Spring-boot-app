package com.sonia.demo.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	@RequestMapping(path = "/withdraw/{accountId}/{balance}", method=RequestMethod.GET)
	public double withdrawAmount(@PathVariable Long accountId, @PathVariable Double balance) {
		
		return accountService.withdraw(accountId, balance);
	}

	@RequestMapping(path = "/deposit/{accountId}/{balance}", method=RequestMethod.POST)
	public void depositAmount(@PathVariable Long accountId, @PathVariable Double balance) {
		
		accountService.deposit(accountId, balance);
	}
	
	@RequestMapping(path = "/newuser", method=RequestMethod.POST)
	public void addData(@RequestBody UserAccount user) {
		
		accountService.addData(user);
	}
	
	@RequestMapping(path = "/balance/{accountId}", method=RequestMethod.GET)
	public double getbalance(@PathVariable Long accountId) {
		
		return accountService.getbalance(accountId);
		
	}
	@RequestMapping(path = "/delete/{accountId}", method=RequestMethod.DELETE)
	public void deleteAccount(@PathVariable Long accountId) {
		
		accountService.deleteAccount(accountId);
	}
	
	@RequestMapping(path = "/user/{accountId}", method=RequestMethod.GET)
	public String userInfo(@PathVariable Long accountId) {
		
		return accountService.getUserInfo(accountId);
	}
}
