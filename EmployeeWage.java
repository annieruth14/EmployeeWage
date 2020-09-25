public class EmployeeWage{
	// Constants
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;
	

	public static int calEmpWage(String company, int empRate, int no_of_days, int max_hrs){
		// variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalDays = 0; 
		int totalHrs = 0;

		// Computation
		while(totalDays < no_of_days && totalHrs <= max_hrs){
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
					
			}
			empWage = empHrs * empRate ;			
			totalEmpWage = totalEmpWage + empWage; 
			totalDays++;
			totalHrs = totalHrs + empHrs;
			System.out.println("Day: "+ totalDays + " Emp hour: "+ totalHrs);
			
		}
		System.out.println("Total Emp Wage for Company "+company + " is : " +totalEmpWage);
		return totalEmpWage;
	}


	public static void main (String[] args){
		calEmpWage("Capgemini",20,2,10); 
		calEmpWage("Reliance",10,4,20); 
		
	}
}




