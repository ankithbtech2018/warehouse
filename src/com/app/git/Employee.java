package com.app.git;

public class Employee 
{
	private String empName;
	private String empDept;
	
	public Employee(String empName, String empDept) {
		super();
		this.empName = empName;
		this.empDept = empDept;
	}

	public Employee() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDept=" + empDept + "]";
	}
	
	
	
	
}
