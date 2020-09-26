import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageArray implements CompanyEmpWage{
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;
	public String company;
	public int empRate;
	public int no_of_days;
	public int max_hrs;
	public int totalEmpWage;
	public int[] totalWageArray ;
	public int i=0;

	public ArrayList<EmpWageArray> listOfComp = new ArrayList<EmpWageArray>();

	public EmpWageArray(){
	}
	
	public EmpWageArray (String company, int empRate, int no_of_days, int max_hrs){
		this.company = company;
		this.empRate = empRate;
		this.no_of_days = no_of_days;
		this.max_hrs = max_hrs; 	
	}


	private void addCompanyEmpWage(String company, int empRate, int no_of_days, int max_hrs){	
		EmpWageArray comp = new EmpWageArray(company, empRate, no_of_days, max_hrs);
		listOfComp.add(comp);
		
	}
	
	private void calEmpWage(){
		int size = listOfComp.size();
		
		totalWageArray = new int[listOfComp.size()];
		for(EmpWageArray e : listOfComp){
			System.out.println("Company : " + e.company);
			int cal = this.calEmpWage(e);
			
			calTotalEmpWage(cal);
		}
		
	}

	public void calTotalEmpWage(int totalEmpWage){
		
		this.totalEmpWage = totalEmpWage;
				
		totalWageArray[i] = totalEmpWage;
		
		i++;
		
	}

	private int calEmpWage(EmpWageArray empWageArray){
		// variables
		int empHrs = 0;
		int empWage = 0;
		
		int totalDays = 0; 
		int totalHrs = 0;
		System.out.println("Daily Employee Wage");
		// Computation
		while(totalDays < empWageArray.no_of_days && totalHrs <= empWageArray.max_hrs){
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
			
			totalDays++;
			totalHrs = totalHrs + empHrs;
			
			System.out.println("Day: "+ totalDays + " Emp hour: "+ empHrs);
			
		}
		
		return totalHrs*empWageArray.empRate ;
	}

	public static void main (String[] args){
		EmpWageArray emparray = new EmpWageArray();
		emparray.addCompanyEmpWage("Capgemini",20,3,8);
		
		emparray.addCompanyEmpWage("Reliance",30,5,11);
		
		emparray.calEmpWage();
		emparray.getTotalWage();
	}

	public void getTotalWage(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to compute the total wage?");
		
		String ans = sc.nextLine();
		if(ans.equalsIgnoreCase("yes")){
			System.out.println("Name the company");
			String name = sc.nextLine();

			for(int k=0;k<listOfComp.size();k++){		//traverse the list to search for company
				if(name.equalsIgnoreCase(listOfComp.get(k).company)){
					System.out.println("The total Employee wage of is " + totalWageArray[k]);
			
				}
			}
		}
	}	
}













