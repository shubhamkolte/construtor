package Contructor;

public class RctangleHW2
{
	int length;
	int breadth;
	
	public RctangleHW2() 
	{
		length=0;
		breadth=0;
	}
	RctangleHW2(int num1, int num2)
	{
		length=num1;
		breadth=num2;
	}
	RctangleHW2(int num1)
	{
		length=breadth=num1;
	}
	void area()
	{
		System.out.println(" Area "+ length*breadth);
		
	}
	
	
	public static void main(String[] args)
	{
		RctangleHW2 s1= new RctangleHW2();
		s1.area();
		
		
		RctangleHW2 s2= new RctangleHW2(5,6);
		s2.area();
		

		RctangleHW2 s3= new RctangleHW2(5);
		s3.area();

	}

}
