package com.insightglobal.day4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a=new Account(123,"IGUSer123",10000.00);
		AccountService service=new AccountService();
		service.addAccount(a);
		
		
		service.listAccounts();

	}

}
