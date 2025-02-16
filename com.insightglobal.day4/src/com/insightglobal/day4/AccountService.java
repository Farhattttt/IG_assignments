package com.insightglobal.day4;

import java.util.ArrayList;

public class AccountService {
	
	ArrayList<Account> accountList=new ArrayList<>();

	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void listAccounts() {
		accountList.forEach(x->System.out.println(x));
	}
}
