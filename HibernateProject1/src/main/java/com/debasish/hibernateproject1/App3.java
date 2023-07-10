package com.debasish.hibernateproject1;


import java.util.ArrayList;
import java.util.List;
import com.debasish.hibernateproject1.entity.College;
import com.debasish.hibernateproject1.entity.Dept;
import com.debasish.hibernateproject1.repository.CollegeRepository;
public class App3 {
	public static void main(String[] args) {
		College college= new College("IEIT","737102");
		Dept dept= new Dept("MECH","CP",college);
		Dept dept1= new Dept("CSE","Arnub",college);
		Dept dept2= new Dept("CIVIL","Ujjal",college);
		Dept dept3= new Dept("EEE","Vidyasagar",college);
		Dept dept4= new Dept("ECE","Thomas",college);
		List<Dept> list= new ArrayList<>();
		list.add(dept);
		list.add(dept1);
		list.add(dept2);
		list.add(dept3);
		list.add(dept4);
		college.setDepts(list);
		CollegeRepository repo= new CollegeRepository();
//		repo.saveCollege(college);
		College college2 = repo.getCollegeById(1);
		List<Dept> depts= college2.getDepts();
		for(Dept d: depts) {
			System.out.println(d.getCollege());
		}
	}
}
