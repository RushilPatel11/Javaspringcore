package com.SpringCore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Rushil Patel")
	private String sname;
	@Value("Vadodara")
	private String address;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String address) {
		super();
		this.sname = sname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", address=" + address + "]";
	}

}
