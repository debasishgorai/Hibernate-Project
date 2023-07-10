package com.debasish.hibernateproject1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.debasish.hibernateproject1.entity.Course;
import com.debasish.hibernateproject1.entity.Student;
import com.debasish.hibernateproject1.repository.CourseRepository;
public class App4 {
	public static void main(String[] args) {
		Student student = new Student("Legain",Date.valueOf(LocalDate.of(1995, 3, 11)));
		Student student1 = new Student("Ram",Date.valueOf(LocalDate.of(1996, 2, 11)));
		Student student2 = new Student("Shayam",Date.valueOf(LocalDate.of(2000, 3, 14)));
		Student student3 = new Student("Plajor",Date.valueOf(LocalDate.of(1997, 8, 8)));
		List<Student>students = new ArrayList<>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		Course course= new Course("J2EE",25);
		Course course1= new Course("CORE",90);
		Course course2= new Course("Frameworks",35);
		course.setStudents(students);
		course1.setStudents(students);
		course2.setStudents(students);
		List<Course> courses= new ArrayList<>();
		courses.add(course);
		courses.add(course1);
		courses.add(course2);
		student.setCourses(courses);
		student1.setCourses(courses);
		student2.setCourses(courses);
		student3.setCourses(courses);
		CourseRepository repository = new CourseRepository();
		repository.saveAllCourse(courses);
	}
}
