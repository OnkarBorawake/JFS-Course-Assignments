package SampleMaven4.ProjDemo4;

import java.util.List;

public class Organization {

		private int id;
		private String name;
		private List<Employee> employeeList;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Employee> getEmployeeList() {
			return employeeList;
		}
		public void setEmployeeList(List<Employee> employeeList) {
			this.employeeList = employeeList;
		}
		@Override
		public String toString() {
			return "Organization [id=" + id + ", name=" + name + ", employeeList=" + employeeList + "]";
		}
		
		

	}

	