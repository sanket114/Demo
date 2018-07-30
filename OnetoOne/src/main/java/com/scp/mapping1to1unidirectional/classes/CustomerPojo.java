package com.scp.mapping1to1unidirectional.classes;

import javax.persistence.OneToOne;

public class CustomerPojo {
	private int id;
	private String name;
	
	private AccountPojo a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AccountPojo getA() {
		return a;
	}
	public void setA(AccountPojo a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
	public CustomerPojo(int id, String name, AccountPojo a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



}
