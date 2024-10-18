package com.SC.CI;

public class person {
	private int pid;
	private String pname;
	private Address add;
	
	
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public person(int pid, String pname, Address add) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.add = add;
	}


	@Override
	public String toString() {
		return "person id=" + this.pid +
				", person name =" + this.pname +
				", Address is;" + this.add.area + ""
				+ this.add.pin;
		}
	
	
	
	}
	


