import java.util.Scanner;

public class mainClass {
	
	static Scanner sc = new Scanner(System.in);
	
   public static void main(String[] args) {
	   
	   System.out.println("Enter the type of Employee , p - permanentEMp or t- temporaryEmp");
	   char emp = sc.next().charAt(0);
	     
	      
	      if (emp == 'p'){
		   Permanentemp emp1 =  new Permanentemp(43,"Mr. Aus",0,0,19,17,12,50000.00,0,0);
		   System.out.println("Employee name is "+emp1.empName);
		   System.out.println("Employee id is "+emp1.empId );
		   
		   System.out.println("Enter s , if the employee availed sick leave");
		   System.out.println("Enter c, if the empoyee availed casual leave");
		   System.out.println("Enter p, if the empoyee availed paid leave");
		   char ch = sc.next().charAt(0);
		   System.out.println("Enter No of Leave availed by the Permanent Employee - "+emp1.empName);
		   int noOfLeave = sc.nextInt();
		   emp1.avail_leave(noOfLeave, ch);
		   emp1.print_leave_details();
		   emp1.calculate_balance_leaves();
		   emp1.calculate_salary();
		   
		   System.out.println("_______________________________________");
	   }
	   else if(emp == 't'){
		   TemporaryEmp emp2 = new TemporaryEmp(20, "Kumar",0,0,29,23,25,20000.00,0,0);
		   System.out.println("Employee Name is "+emp2.empName);
		   System.out.println("Employee id is "+emp2.empId);
		   
		   System.out.println("Enter s , if the employee availed sick leave");
		   System.out.println("Enter c, if the empoyee availed casual leave");
		   System.out.println("Enter p, if the empoyee availed paid leave");
		   char ch1 = sc.next().charAt(0);
		   System.out.println("Enter no of Leave availed by the Temporary Employee - "+emp2.empName);
		   int noOfLeave1 = sc.nextInt();
		   emp2.avail_leave(noOfLeave1, ch1);
		   emp2.calculate_balance_leaves();
		   emp2.calculate_salary();
		   System.out.println("________________________________________");
	   }
	   else if (emp != 'p' ||  emp != 't'){
		   System.out.println("Choose the right option");
	   }else{
		   System.out.println("");
	   }
	
	  
	   
   }

}
