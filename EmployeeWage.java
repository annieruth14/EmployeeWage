public class EmployeeWage{
	// Constants
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS = 100;

	public static void main (String[] args){
		
		// variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalDays = 0; 
		int totalHrs = 0;

		// Computation
		while(totalDays < NO_OF_WORKING_DAYS && totalHrs <= MAX_HOURS){
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
			empWage = empHrs * EMP_RATE_PER_HOUR ;			
			totalEmpWage = totalEmpWage + empWage; 
			totalDays++;
			totalHrs = totalHrs + empHrs;
			System.out.println("Day: "+ totalDays + " Emp hour: "+ totalHrs);
			
		}
		System.out.println("Total Emp Wage : " + totalEmpWage);
	}
}




