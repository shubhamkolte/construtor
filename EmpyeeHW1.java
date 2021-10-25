package Contructor;

public class EmpyeeHW1 {

	int salary=1500;
	String name;
	public String EmpyeeHW1(String name) 
	{
		this.name=name;
		System.out.print(salary);
		return name;
	}
	public  EmpyeeHW1() 
	{
		System.out.println("salary "+salary);
	}
	
	public static void main(String[] args) 
	{
		EmpyeeHW1 emp =new EmpyeeHW1();
		
		System.out.println("salary "+emp.EmpyeeHW1("shubham"));
	}

}
