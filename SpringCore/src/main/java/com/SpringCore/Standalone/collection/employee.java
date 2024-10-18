package com.SpringCore.Standalone.collection;

import java.util.List;

public class employee {
	private List<String>Ename;

	public List<String> getEname() {
		return Ename;
	}

	public void setEname(List<String> ename) {
		Ename = ename;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(List<String> ename) {
		super();
		Ename = ename;
	}

	@Override
	public String toString() {
		return "employee [Ename=" + Ename + "]";
	}

}
