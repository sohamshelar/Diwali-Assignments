package com.dao;

import java.io.*;

import java.util.HashSet;
import java.util.Set;
import com.beans.Student;

public class StudentDaoImpl implements StudentDao {
    private static final String File = "StudentData.txt";

    @Override
    public void saveStudent(Set<Student> std) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File))) {
            for (Student s : std) {
                oos.writeObject(s);
            }
            System.out.println("Student(s) saved successfully to file: " + File);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set<Student> loaddata() throws ClassNotFoundException {
        Set<Student> Students = new HashSet<>();
        File f = new File(File);
        if (!f.exists()) {
            // File not created yet, return empty set
            return Students;
        }

        try (ObjectInputStream ios = new ObjectInputStream(new FileInputStream(File))) {
            while (true) {
                try {
                    Student s = (Student) ios.readObject();
                    Students.add(s);
                } catch (EOFException e) {
                    break; // end of file reached
                }
            }
        } catch (IOException e) {
            // ignore EOF or stream closed errors
        }

        return Students;
    }
}
