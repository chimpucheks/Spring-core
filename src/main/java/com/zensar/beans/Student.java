package com.zensar.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import java.util.Map;
//import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student implements InitializingBean,DisposableBean{

	private int studentId;
	private String studentName;
	private int studentAge;
	
	private Address address;
	
	

	public Student() {
		super();
		System.out.println("iam inside deafult constructir");
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("iam inside myinit method");
	}
	
	@PreDestroy
	public void myDestroy() {
		// TODO Auto-generated method stub
		System.out.println("iam inside destroy method");
	}


	public Student(int studentId, String studentName, int studentAge, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * public void afterPropertiesSet() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("iam inside afterset method"); }
	 */

	
	
	
	
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("add2") private Address address;
	 * 
	 * 
	 * // private Map<Integer,Address> address; private Map<Address, Integer>
	 * address;
	 * 
	 * private Properties properties;
	 * 
	 * public Student() { super();
	 * 
	 * }
	 * 
	 * public Student(int studentId, String studentName, int studentAge,
	 * Map<Address, Integer> address) { super(); this.studentId = studentId;
	 * this.studentName = studentName; this.studentAge = studentAge; this.address =
	 * address; }
	 * 
	 * public int getStudentId() { return studentId; }
	 * 
	 * public void setStudentId(int studentId) { this.studentId = studentId; }
	 * 
	 * public String getStudentName() { return studentName; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 * 
	 * public int getStudentAge() { return studentAge; }
	 * 
	 * public void setStudentAge(int studentAge) { this.studentAge = studentAge; }
	 * 
	 * public Map<Address, Integer> getAddress() { return address; }
	 * 
	 * public void setAddress(Map<Address, Integer> address) { this.address =
	 * address; }
	 * 
	 * public Properties getProperties() { return properties; }
	 * 
	 * public void setProperties(Properties properties) { this.properties =
	 * properties; }
	 * 
	 * @Override public String toString() { return "Student [studentId=" + studentId
	 * + ", studentName=" + studentName + ", studentAge=" + studentAge +
	 * ", address=" + address + ", properties=" + properties + "]"; }
	 */

}
