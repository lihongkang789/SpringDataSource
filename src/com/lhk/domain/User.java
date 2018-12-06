package com.lhk.domain;

public class User {

	private int Id;
	private String Name;
	private String Address;
	private String Phone;
	private int Age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public User(int id, String name, String address, String phone, int age) {
		Id = id;
		Name = name;
		Address = address;
		Phone = phone;
		Age = age;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Address=" + Address
				+ ", Phone=" + Phone + ", Age=" + Age + "]";
	}
	
	public User(){}
	
}
