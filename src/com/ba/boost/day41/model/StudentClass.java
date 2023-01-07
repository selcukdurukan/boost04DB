package com.ba.boost.day41.model;

public class StudentClass {

	private Long nationalId;
	private String firstName;
	private String lastName;
	private String city;
	private String street;
	private String country;
	private int countryCode;
	private String telephoneNumber;
	private int courseId;
	private String courseName;
	private int attandenceYear;
	private double grade;

	public Long getNationalId() {
		return nationalId;
	}

	public void setNationalId(Long nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAttandenceYear() {
		return attandenceYear;
	}

	public void setAttandenceYear(int attandenceYear) {
		this.attandenceYear = attandenceYear;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentClass [nationalId=" + nationalId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", city=" + city + ", street=" + street + ", country=" + country + ", countryCode=" + countryCode
				+ ", telephoneNumber=" + telephoneNumber + ", courseId=" + courseId + ", courseName=" + courseName
				+ ", attandenceYear=" + attandenceYear + ", grade=" + grade + "]";
	}

}
