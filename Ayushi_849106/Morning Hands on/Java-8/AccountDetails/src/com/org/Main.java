package com.org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountService s=new AccountService();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1: Add account\r\n" + 
					"2: Remove account by account number\r\n" + 
					"3: Display account by account number\r\n" + 
					"4: Display all account by account number\r\n" + 
					"5: Display those account having the balance less than 1000\r\n" + 
					"6: Exit");
			System.out.println("Enter the input");
			int op=sc.nextInt();
			switch(op)
			{
			case 1:
				Account a=new Account();
				System.out.println("Enter Account number");
				int acc=sc.nextInt();
				a.setAccNo(acc);
				System.out.println("Enter Name");
				String name=sc.next();
				a.setName(name);
				System.out.println("Enter the amt");
				double amt=sc.nextDouble();
				a.setAmt(amt);
				try {
				s.addNewAccount(a);
				}catch(AccountAlreadyException aae) {
				System.out.println(aae.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter account number");
				int acc1=sc.nextInt();
				try {
				s.removeAccount(acc1);
				}catch(AccountNotFoundException anfe) {
					System.out.println(anfe.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter account number");
				int acc2=sc.nextInt();
				try {
				System.out.println(s.Display(acc2));
				}catch(AccountNotFoundException anfe) {
					System.out.println(anfe.getMessage());
				}
				break;
			case 4:
				s.allAccountDisplay().forEach(acc3 -> System.out.println(acc3));
				break;
			case 5:
				s.accordingToBalanace().forEach(acc4 ->System.out.println(acc4));
				break;
			case 6:
				System.out.println("Exited.....");
				System.exit(0);
			default: 
				System.out.println("Incorrect options chossen...");
				
			}
			
			
		}while(true);
	}
	

}
