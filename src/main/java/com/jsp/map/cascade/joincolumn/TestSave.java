package com.jsp.map.cascade.joincolumn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pallavi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bank bank=new Bank();
		bank.setName("HDFC");
		
		
		
		Branch branch1=new Branch();
		branch1.setName("vashi");
		branch1.setIfsc_code("hdfcvashi123");
		
		Branch branch2=new Branch();
		branch2.setName("thane");
		branch2.setIfsc_code("hdfcthane123");
		
		Branch branch3=new Branch();
		branch3.setName("panvel");
		branch3.setIfsc_code("hdfcpanvel123");
		
		
		
		List<Branch>branches=new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);
		
		bank.setBranches(branches);
		branch1.setBank(bank);
		branch2.setBank(bank);
		branch3.setBank(bank);
		
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityTransaction.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}}
