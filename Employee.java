
public abstract class Employee {
	
	 int empId;
	String empName;
	int total_leaves;
	double total_salary;
	
	public Employee(int empId, String empName, int total_leaves, double total_salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.total_leaves = total_leaves;
		this.total_salary = total_salary;
	}
	
	abstract void calculate_balance_leaves();
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
	abstract void calculate_salary();

	
}


