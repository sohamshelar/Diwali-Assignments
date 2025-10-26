package com.beans;

import java.io.Serializable;

public class Student implements Serializable {

//	Create a class Student with following details: rollno, sname, course,
//	attendance_percentage, score
//	1. Add constructors - default and parameterized
	  private int rollno;
	    private String sname;
	    private String course;
	    private double attendance_percentage;
	    private double score;
	    private String grade;
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public double getAttendance_percentage() {
			return attendance_percentage;
		}
		public void setAttendance_percentage(double attendance_percentage) {
			this.attendance_percentage = attendance_percentage;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", attendance_percentage="
					+ attendance_percentage + ", score=" + score + "]";
		}
		public Student(int rollno, String sname, String course, double attendance_percentage, double score) throws lessAttendanceException {
			super();
			this.rollno = rollno;
			this.sname = sname;
			this.course = course;
			this.attendance_percentage = attendance_percentage;
			this.score = score;
			
			if(attendance_percentage<60) {
				throw new lessAttendanceException("Attendance is lees than 60 for "+sname);
			}
			
			calculateGrade(score); 
		}
		public Student() {
			super();
		}
		public void  calculateGrade(double score) {
			 if (score >= 90) grade = "A";
		        else if (score >= 80) grade = "B";
		        else if (score >= 70) grade = "C";
		        else if (score >= 60) grade = "D";
		        else grade = "F";
		}
	   
}

class lessAttendanceException extends Exception{
	public lessAttendanceException(String message) {
        super(message);
    }
}