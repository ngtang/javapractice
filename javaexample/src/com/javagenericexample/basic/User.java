package com.javagenericexample.basic;

public class User {

	public int id;
	public String name;
	public String email;
	
	public User(int id,String name, String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	@Override
	public String toString()
	{
		return "id: "+this.id+" - name: "+this.name+" - email: "+this.email;
	}
}
