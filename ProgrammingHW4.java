package Contructor;

public class ProgrammingHW4 
{
	public ProgrammingHW4() 
	{
		System.out.println( "I want to learn language");
	}
	
	public ProgrammingHW4(String s1) 
	{
		System.out.println( "I want to learn language "+s1);
	}
	
	public static void main(String[] args)
	{
		ProgrammingHW4 p=new ProgrammingHW4();
		ProgrammingHW4 p2=new ProgrammingHW4("Java");
	}

}
