public class EmployeeWage{
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;

	private final String company;
	private final int empRate;
	private final int no_of_days;
	private final int max_hrs;
	private int totalEmpWage;

	public EmployeeWage (String company, int empRate, int no_of_days, int max_hrs){
		this.company = company;
		this.empRate = empRate;
		this.no_of_days = no_of_days;
		this.max_hrs = max_hrs; 	
	}

	public void calEmpWage(){
		// variables
		int empHrs = 0;
		int empWage = 0;
		
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
		
	}
	
	public static void main (String[] args){
		EmployeeWage Capg = new EmployeeWage("Capgemini",20,3,8);
		EmployeeWage Rel = new EmployeeWage("Reliance",30,2,11);
		Capg.calEmpWage();
		Rel.calEmpWage();
		System.out.println("Total Emp Wage for Company "+Capg.company + " is : " +Capg.totalEmpWage);
		System.out.println("Total Emp Wage for Company "+Rel.company + " is : " +Rel.totalEmpWage);
	}
}




















