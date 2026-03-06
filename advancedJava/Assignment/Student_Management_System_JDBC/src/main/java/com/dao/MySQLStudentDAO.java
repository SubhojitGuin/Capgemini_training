package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.StudentDAO;
import com.exception.InvalidStudentDataException;
import com.model.Student;

public class MySQLStudentDAO implements StudentDAO {
	
	private static final String INSERT_STUDENT_QUERY = "INSERT INTO students (name, email, age, mobile) VALUES (?, ?, ?, ?)";
	private static final String SELECT_ALL_STUDENTS_QUERY = "SELECT * FROM students";
	private static final String UPDATE_EMAIL_BY_MOBILE_NUMBER_QUERY = "UPDATE students SET email = ? WHERE mobile = ?";
	private static final String DELETE_STUDENT_BY_ID_QUERY = "DELETE FROM students WHERE id = ?";
	
	private Connection conn;
	
	public MySQLStudentDAO() throws SQLException {
		conn = MySQLResourceSingleton.getConnection();
	}

	@Override
	public void insertNewStudent(Student student) throws SQLException {
		PreparedStatement preparedStatement = conn.prepareStatement(INSERT_STUDENT_QUERY);
		preparedStatement.setString(1, student.getName());
		preparedStatement.setString(2, student.getEmail());
		preparedStatement.setInt(3, student.getAge());
		preparedStatement.setLong(4, student.getMobileNumber());
		
		int rowsAffected = preparedStatement.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Student entered successfully");
		} else {
			System.out.println("Unable to insert student");
		}
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		List<Student> students = new ArrayList<>();
		
		PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_STUDENTS_QUERY);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			Student student = new Student(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getString("email"),
						resultSet.getInt("age"),
						resultSet.getLong("mobile")
					);
			
			students.add(student);
		}
		
		return students;
	}

	@Override
	public void updateStudentEmailUsingMobileNumber(long mobileNumber, String email) throws SQLException, InvalidStudentDataException {
		PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_EMAIL_BY_MOBILE_NUMBER_QUERY);
		
		if (!email.matches("[\\w]+@[A-Za-z][\\w]*\\.[A-Za-z]{1,3}")) {
			throw new InvalidStudentDataException("Student email is invalid");
		}
		
		preparedStatement.setString(1, email);
		preparedStatement.setLong(2, mobileNumber);
		
		int rowsAffected = preparedStatement.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Student updated successfully");
		} else {
			System.out.println("Failed to update student details");
		}
	}

	@Override
	public void deleteStudentById(int id) throws SQLException {
		PreparedStatement preparedStatement = conn.prepareStatement(DELETE_STUDENT_BY_ID_QUERY);
		
		preparedStatement.setInt(1, id);
		
		int rowsAffected = preparedStatement.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Student deleted successfully");
		} else {
			System.out.println("Failed to delete student");
		}
	}

}
