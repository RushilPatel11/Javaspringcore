package com.midsem.aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department {
	@Autowired
	@Qualifier("emp")
	private int did;
	private String dname;
	private int salary;
	private Employee employee;
	public Department(int did, String dname, int salary, Employee employee) {
		super();
		this.did = did;
		this.dname = dname;
		this.salary = salary;
		this.employee = employee;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", salary=" + salary + ", employee=" + employee + "]";
	}
	

}
