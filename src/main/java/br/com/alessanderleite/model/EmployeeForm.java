package br.com.alessanderleite.model;

public class EmployeeForm {

	private Long empId;
	private String empNo;
	private String empName;
	private String position;
	
	public EmployeeForm() {
		
	}
	
	public Long getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	
	public String getEmpNo() {
		return this.empNo;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
}
