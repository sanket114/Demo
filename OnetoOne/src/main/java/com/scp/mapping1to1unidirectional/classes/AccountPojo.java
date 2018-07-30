package com.scp.mapping1to1unidirectional.classes;

public class AccountPojo {
	private int accountid;
	private BankAccount account;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", account=" + account + "]";
	}
	public AccountPojo(int accountid, BankAccount account) {
		super();
		this.accountid = accountid;
		this.account = account;
	}
	public AccountPojo() {
		super();
		// TODO Auto-generated constructor stub
	}


}
