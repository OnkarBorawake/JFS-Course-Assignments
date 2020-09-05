package SampleMaven4.ProjDemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private long empId;
	private String empName; 
	private double salary;
	private Address	address;
	private Department dept;
	
	
	
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	
	
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Autowired
	@Qualifier("dept2")
	public void setDepartment(Department dept) {
		this.dept = dept;
	}
//	public void provideAddress(Address address)
//	{
//		System.out.println("running");
//		this.address = address;
//	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ ", dept=" + dept + "]";
	}
	
	@Autowired
	public Employee(long empId, String empName, double salary, Address address, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
	} 
	
	
	
}
