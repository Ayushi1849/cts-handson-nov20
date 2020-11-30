package com.org;

public class Account {

	private int accNo;
	private String name;
	private double amt;
	
	public Account() {
		super();
	}
	public Account(int accNo, String name, double amt) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.amt = amt;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", amt=" + amt + "]";
	}
	
	
}
