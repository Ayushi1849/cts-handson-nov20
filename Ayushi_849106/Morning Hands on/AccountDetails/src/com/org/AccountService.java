package com.org;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

List<Account> accList=new ArrayList<Account>();
	
	public void addNewAccount(Account acc)throws AccountAlreadyException
	{
			for(Account ac: accList)
			{
				if(ac.getAccNo()==acc.getAccNo())
					throw new AccountAlreadyException("Account already exist....");
			}
			accList.add(acc);
	}
	
	public void removeAccount(int accno)throws AccountNotFoundException
	{
		if(accList.removeIf(a1 -> a1.getAccNo()==accno))
			System.out.println("account removed");
		else
			throw new AccountNotFoundException("Account not found....");
		
	}
	
	public Account Display(int accno) throws AccountNotFoundException
	{
		
		for(Account acc: accList)
		{
			if(acc.getAccNo()==accno)
				return acc;
		}
	 throw new AccountNotFoundException("Account not found....");

	}
	
	public List<Account> allAccountDisplay(){
		
		return accList;
	}
	
	public List<Account> accordingToBalanace(){
		List<Account> newList =new ArrayList<Account>();
		for(Account acc: accList)
		{
			if(acc.getAmt()<1000)
				newList.add(acc);
		}
		return newList;
	}
	
}
