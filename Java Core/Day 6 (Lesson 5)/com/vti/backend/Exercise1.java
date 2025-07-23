package com.vti.backend;

import com.vti.entity.*;

public class Exercise1 {
	public int id;
	public String name;
	
	
	public void Department() {

	}


	public void Department(String nameDepartment) {
		this.id = 0;
		this.name = nameDepartment;
	}

	public static void main(String[] args) {
		
		//
		Department dep1 = new Department();
		System.out.println("Department 1: ");
		dep1.setId(1);
		System.out.println("Id: " + dep1.getId());
		dep1.setName("IT");
		System.out.println("Department Name: " + dep1.getName());
		
		//
		Department dep2 = new Department();
		dep2.setName("Sale");
		System.out.println("Department 2: ");
		dep2.setId(2);
		System.out.println("ID: " + dep2.getId());
		System.out.println("Department Name: " + dep2.getName());
	}
}
