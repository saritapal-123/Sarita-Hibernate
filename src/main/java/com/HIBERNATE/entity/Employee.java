package com.HIBERNATE.entity;

public class Employee {
	
	private int id ;
	private String name,gender;
	private int salary;
	
	public  Employee() {
		super();
	}
	public Employee( String name,String gender ,int salary)
	{
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		
		
		
		
		
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id =id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
	this.gender = gender;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	@Override
public String toString() {
		return "Employee [id"+id+",name="+name+",gender="+gender+",salary="+salary+"]";
	}
}	

