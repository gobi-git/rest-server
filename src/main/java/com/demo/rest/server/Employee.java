package com.demo.rest.server;

public class Employee implements Comparable<Employee> {

	private String employeeId;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	private String name;

	private String gender;

	private Integer salary;

	private String city;

	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public int compareTo(Employee o) {
		return this.city.compareToIgnoreCase(o.city);
	}
	
	
	@Override
	public String toString() {
		return "Employee [ employeeId=" + employeeId + ", name=" + name + ", gender=" + gender
				+ ", salary=" + salary + ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Employee)) {
			return false;
		}
		Employee e = (Employee) o;
		return e.employeeId.equals(employeeId); /*&& e.name.equals(name) && e.gender.equals(gender) &&
				e.salary.equals(salary) && e.city.equals(city) && e.country.equals(country);*/
	}

}
