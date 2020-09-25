public class CompanyEmpWage{

	public final String company;
	public final int empRate;
	public final int no_of_days;
	public final int max_hrs;
	public int totalEmpWage;
	
	public CompanyEmpWage (String company, int empRate, int no_of_days, int max_hrs){
		this.company = company;
		this.empRate = empRate;
		this.no_of_days = no_of_days;
		this.max_hrs = max_hrs; 	
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}
}
