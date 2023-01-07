package com.ba.boost.day41;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ba.boost.day41.model.StudentClass;

public class MyMainClass {

	private List<StudentClass> studentClasses = new ArrayList<>();
	private Connection connection = DatabaseConnection.getInstance().getCon();

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Wrong number of arguments. Expected <<<1>>> actual <<<" + args.length + ">>>");
			System.exit(100);
		}

		DatabaseConnection.getInstance().setPropertiesFile(args[0]);

		MyMainClass main = new MyMainClass();
		main.createStudent();
		main.retrieveStudentClass();
		main.listStudentClass();

	}

	private void listStudentClass() {
		
		for (StudentClass i : studentClasses) {
			System.out.println(i);
		}
		
	}

	private void retrieveStudentClass() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs    = stmt.executeQuery("SELECT * FROM student_classes");
			
			while (rs.next()) {
				StudentClass stu = new StudentClass();
				stu.setNationalId(rs.getLong(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setCity(rs.getString(4));
				stu.setStreet(rs.getString(5));
				stu.setCountry(rs.getString(6));
				stu.setCountryCode(rs.getInt(7));
				stu.setTelephoneNumber(rs.getString(8));
				stu.setCourseId(rs.getInt(9));
				stu.setCourseName(rs.getString(10));
				stu.setAttandenceYear(rs.getInt(11));
				stu.setGrade(rs.getDouble(12));
				this.studentClasses.add(stu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void createStudent() {
		StudentClass stu1 = new StudentClass();
		stu1.setAttandenceYear(2022);
		stu1.setCity("Istanbul");
		stu1.setCountry("Turkey");
		stu1.setCourseId(1);
		stu1.setCourseName("Java");
		stu1.setFirstName("Ersan");
		stu1.setGrade(8.5d);
		stu1.setLastName("Kuneri");
		stu1.setNationalId(123456L);
		stu1.setStreet("Beyoglu");
		stu1.setTelephoneNumber("123456123");
		System.out.println(stu1);

	}

}
