package com.test;

import java.util.Scanner;


import com.service.*;


public class StudentTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StudentService Sservice = new StudentServiceImpl();
		
		while(true) {
		System.out.println("Entert the choice as per the list:\n1. Add new Student\n 2. Display All Student \n3. Exit");
		int choice= sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status= Sservice.AddNewStudent();
			if(status) {
				System.out.println("Done, Studend Added successfully ");
			}else {
				System.out.println("Unable to add student ");
			}
		}
		case 2->{
			Sservice.displayAllStudents();
		}
		case 3->{
			 System.out.println("👋 Exiting... Goodbye!");
             sc.close();
             System.exit(0);
		}
		default->{
			System.out.println("Enter the valid choice");
		}
		}
		
		}

	}

}
