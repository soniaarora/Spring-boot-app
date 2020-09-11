package com.sonia.demo.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private UserRepository userRepository;
	
	public double withdraw(Long accountId, Double balance) {
		
		UserAccount account = userRepository.getOne(accountId);
		account.setBalance(account.getBalance()-balance);
		userRepository.save(account);
		return account.getBalance();
	}


	public void deposit(Long accountId, Double balance) {
		
		UserAccount account = userRepository.getOne(accountId);
		account.setBalance(account.getBalance()+balance);
		userRepository.save(account);
	}
	
	
	public void addData(UserAccount user) {
		
		userRepository.save(user);
	}
	
	public double getbalance(Long accountId) {
		UserAccount account = userRepository.getOne(accountId);
		return account.getBalance();
	}
	
	public void deleteAccount(Long accountId) {
		
		userRepository.deleteById(accountId);
	}

	public String getUserInfo(Long accountId) {
		UserAccount account = userRepository.getOne(accountId);
		return account.toString();
	}

	

}
