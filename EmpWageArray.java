public class EmpWageArray{
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageArray(){
		companyEmpWageArray = new CompanyEmpWage[5];	
	} 
	
	private void addCompanyEmpWage(String company, int empRate, int no_of_days, int max_hrs){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRate, no_of_days, max_hrs);
		numOfCompany++;
	}
	
	private void calEmpWage(){
		for(int i=0; i<numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.calEmpWage(companyEmpWageArray[i]));
		}
	}

	private int calEmpWage(CompanyEmpWage companyEmpWage){
		// variables
		int empHrs = 0;
		int empWage = 0;
		
		int totalDays = 0; 
		int totalHrs = 0;

		// Computation
		while(totalDays < companyEmpWage.no_of_days && totalHrs <= companyEmpWage.max_hrs){
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
			empWage = empHrs * companyEmpWage.empRate ;			
			
			totalDays++;
			totalHrs = totalHrs + empHrs;
			System.out.println("Day: "+ totalDays + " Emp hour: "+ empHrs);
			
		}
		return totalHrs;
	}

	public static void main (String[] args){
		EmpWageArray emparray = new EmpWageArray();
		emparray.addCompanyEmpWage("Capgemini",20,3,8);
		emparray.addCompanyEmpWage("Reliance",30,5,11);	
		emparray.calEmpWage();
	}
}













