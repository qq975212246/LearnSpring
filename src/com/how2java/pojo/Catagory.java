package com.how2java.pojo;

import org.springframework.stereotype.Component;

@Component("c")
public class Catagory {
	private int id;
	private String name = "Catagory 1";

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

}
