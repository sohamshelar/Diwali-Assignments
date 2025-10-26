package com.service;

import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.beans.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao Sdao=new StudentDaoImpl(); 
	Scanner sc= new Scanner(System.in);
	Set<Student> std;
    public StudentServiceImpl() {
        try {
            // Load previous data from file (if available)
            std = Sdao.loaddata();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (std == null) {
            std = new HashSet<>();
        }
    }
	
	@Override
	public boolean AddNewStudent() {
		try {
			 
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Attendance Percentage: ");
        double att = sc.nextDouble();
        System.out.print("Enter Score: ");
        double score = sc.nextDouble();

		Student s=new Student(roll, name, course, att, score);
		std.add(s);
		Sdao.saveStudent(std);
		return true; 
		}
		catch(Exception e) {
			System.out.println("Error while adding ne wstudent :"+e.getMessage());
			return false;
		}
	}

	@Override
	public void displayAllStudents() {
		try {
			std=Sdao.loaddata();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		 for(Student s: std) {
			 System.out.println(s);
		 }
		
	}

}
