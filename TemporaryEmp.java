
public class TemporaryEmp extends Permanentemp {
	
	
    

	public TemporaryEmp(int empId, String empName, int total_leaves, double total_salary, int paid_leave,
			int sick_leave, int casual_leave, double basic, double hra, double pfa) {
		super(empId, empName, total_leaves, total_salary, paid_leave, sick_leave, casual_leave, basic, hra, pfa);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculate_balance_leaves() {
        
		int balanceLeaves = (sick_leave+casual_leave+paid_leave);
		System.out.println("Total available balance leave is" +balanceLeaves);
		
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		int availLeave;
		if(no_of_leaves > 0 && type_of_leave=='c'){
			System.out.println("leave availed is casual leave" );
			availLeave = casual_leave - no_of_leaves;
			System.out.println("Available casual Leaves are " +availLeave);
		}else if(no_of_leaves > 0 && type_of_leave == 's'){
			System.out.println("leave availed is sick leave");
			availLeave = sick_leave - no_of_leaves;
			System.out.println("Available sick leaves are" +availLeave);
		}else if(no_of_leaves > 0 && type_of_leave== 'p'){
			System.out.println("leave availed is paid leave");
			availLeave = paid_leave - no_of_leaves;
			System.out.println("Available leaves are " +availLeave);
		}
		return true;
		
	}

	@Override
	void calculate_salary() {
		pfa = basic/100 *12;
		hra = basic/100 *50;
		
		double total_salary = (hra + basic) - pfa;
		System.out.println("Total salary of "+empName + " is "+total_salary);
	}

}
