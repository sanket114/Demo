package com.scp.mapping1to1unidirectional.classes;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TestMain {
public static void main(String[] args) {
	AccountPojo a1= new AccountPojo(12345, BankAccount.Saving);
	CustomerPojo c1=new CustomerPojo(123, "Sanket", a1);
	Session s1= Utlity.getSession();
	Transaction t= s1.beginTransaction();
	s1.save(mapPojoToEntity(c1));
//	/s1.save(c1);
	s1.flush();
	t.commit();
	
}
private static CustomerPojo mapEntityToPojo(CustomerEntity userEntity){
	if(userEntity==null)
		return null;
	AccountPojo apojo=new AccountPojo();
	CustomerPojo pojo = new CustomerPojo();
	pojo.setId(userEntity.getId());
	pojo.setName(userEntity.getName());
	apojo.setAccount(userEntity.getA().getAccount());
	apojo.setAccountid(userEntity.getA().getAccountid());
	pojo.setA(apojo);
	
	return pojo;
}

private static CustomerEntity mapPojoToEntity(CustomerPojo userPojo){
	if(userPojo==null)
		return null;
	AccountEntity apojo=new AccountEntity();
	CustomerEntity pojo = new CustomerEntity();
	pojo.setId(userPojo.getId());
	pojo.setName(userPojo.getName());
	apojo.setAccount(userPojo.getA().getAccount());
	apojo.setAccountid(userPojo.getA().getAccountid());
	pojo.setA(apojo);;
	
	return pojo;
}
}
