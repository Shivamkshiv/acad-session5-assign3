
public class Permanentemp extends Employee {
	
	
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;


	public Permanentemp(int empId, String empName, int total_leaves, double total_salary, int paid_leave,
			int sick_leave, int casual_leave, double basic, double hra, double pfa) {
		super(empId, empName, total_leaves, total_salary);
		this.paid_leave = paid_leave;
		this.sick_leave = sick_leave;
		this.casual_leave = casual_leave;
		this.basic = basic;
		this.hra = hra;
		this.pfa = pfa;
	}

	void print_leave_details(){
		
		System.out.println("Type of Employee is Permanent");
		System.out.println("No of Paid Leave is "+paid_leave);
		System.out.println("No of sick Leave is" +sick_leave);
		System.out.println("No of casual leave is " +casual_leave);
		
	
		
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
			System.out.println("Svailable leaves are " +availLeave);
		}
		return true;
		
	}

	@Override
	void calculate_salary() {
		
		pfa = basic/100*12;
		hra = basic/ 100 * 50;
		
		 total_salary = (basic + hra) - pfa;
		System.out.println("Total salary of "+empName + " is "+total_salary);
	}

}
