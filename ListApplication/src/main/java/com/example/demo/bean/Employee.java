package com.example.demo.bean;

import com.example.demo.vo.Address;

public class Employee implements Comparable<Employee> {
	private int employID;
	private String employName;
	private double salary;
	private Address address;

	public Employee() {

	}

	public int getEmployID() {
		return employID;
	}

	public String getEmployName() {
		return employName;
	}

	public double getSalary() {
		return salary;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("here employee id is >>>>>>" + employID + ">>>>>>>>>" + o.getEmployID());
		if (employID == o.getEmployID()) {
			System.out.println("1111111111111111111111111111111111111111");
			return 0;
		} else {
			return 1;
		}
	}
}
