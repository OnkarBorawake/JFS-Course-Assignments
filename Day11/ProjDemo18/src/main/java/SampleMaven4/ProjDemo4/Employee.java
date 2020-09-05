package SampleMaven4.ProjDemo4;


public class Employee {
	
		private long empId;
		private String empName; 
		private double salary;

		
		public Employee(long empId, String empName, double salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
		}
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
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
		}
		
		
	}
