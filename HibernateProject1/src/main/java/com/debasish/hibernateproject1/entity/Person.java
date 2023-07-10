package com.debasish.hibernateproject1.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person implements Serializable{
	@Id
	private Integer id;
	private String name,gender;
	private Integer age;
	@Column(name="phone_numb")
	private String phoneNumb;
//	private String phone_numb;
	@OneToOne(cascade = CascadeType.ALL)
	private OrderData orderData;
	
	public Person(){
		
	}
	public Person(Integer id, String name, String gender, Integer age, String phoneNumb) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNumb = phoneNumb;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhoneNumb() {
		return phoneNumb;
	}
	public void setPhoneNumb(String phoneNumb) {
		this.phoneNumb = phoneNumb;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNumb="
				+ phoneNumb + "]";
	}
}
