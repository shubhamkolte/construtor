package Contructor;

public class vehicle 
{
	String color="Black";
	int wheelCount=4;
	int gesrsCount=5;
	vehicle()
	{
		System.out.println(color+" "+wheelCount+" "+gesrsCount);
		
	}
	vehicle(String color,int gearscount)
	{
		this();
		this.color=color;
		this.gesrsCount=gearscount;
		System.out.println(color+" "+wheelCount+" "+gesrsCount);
		
	}
	public static void main(String[] args) 
	{
		vehicle v=new vehicle("red",40);
	}

}
