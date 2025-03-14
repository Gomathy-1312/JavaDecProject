package day6;

public class Encapsulationex {

	private String employeename;
	private char employeegrade;
	private int employeesalary;

	
	public String getEmployeename() {
		return employeename;
	}

	
	public void setEmployeename(String employeename) {
		System.out.println(employeename);
		this.employeename = employeename;
	}

	
	public char getEmployeegrade() {
		return employeegrade;
	}

	
	public void setEmployeegrade(char employeegrade) {
		System.out.println(employeegrade);
		this.employeegrade = employeegrade;
		
	}

	
	public int getEmployeesalary() {
		return employeesalary;
	}

	
	public void setEmployeesalary(int employeesalary) {
		System.out.println(employeesalary);
		this.employeesalary = employeesalary;
	}

	public static void main(String[] args) {

		Encapsulationex ex = new Encapsulationex();
		ex.getEmployeegrade();
		ex.getEmployeename();
		ex.getEmployeesalary();
		
		ex.setEmployeegrade('A');
		
		ex.setEmployeename("John");
		
		ex.setEmployeesalary(10000);
		
		
		

	}

}
