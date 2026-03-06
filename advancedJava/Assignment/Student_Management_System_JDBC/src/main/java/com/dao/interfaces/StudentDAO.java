package com.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.exception.InvalidStudentDataException;
import com.model.Student;

public interface StudentDAO {
	
	void insertNewStudent(Student student) throws SQLException;
	
	List<Student> getAllStudents() throws SQLException;
	
	void updateStudentEmailUsingMobileNumber(long mobileNumber, String email) throws SQLException, InvalidStudentDataException;
	
	void deleteStudentById(int id) throws SQLException;

}
