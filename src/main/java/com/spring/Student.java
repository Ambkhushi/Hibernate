package com.spring;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
 
 @Id
 private int id;
 private String name;
 private String City;
 
public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	City = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
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
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.id+": "+this.name+":"+this.City;
}
 

 
 
}
