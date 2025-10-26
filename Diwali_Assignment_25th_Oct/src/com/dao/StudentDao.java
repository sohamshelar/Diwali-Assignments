package com.dao;

import java.util.Set;

import com.beans.*;

public interface StudentDao {

	void saveStudent(Set<Student> std);

	Set<Student> loaddata() throws ClassNotFoundException;

}
