
public class EmployeeInfo {

	private int employeeID;
	private String employeeName;
	private long employeeNo;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}

	
	  @Override public String toString() { return "Employee [EmpID : " + employeeID
	  + "\tEmpName: " + employeeName + " ] ";
	  
	  }
	 

}