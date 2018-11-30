package com.app.git;

public class Employee 
{
	private String empName;
	private String empDept;
	private Integer empId;
	private String empGender;
	
	public Integer getEmpId(){
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
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
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDept=" + empDept + ", empId=" + empId + ", empGender=" + empGender
				+ "]";
	}

	
	
	
	
	
}
