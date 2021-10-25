package Contructor;

public class circleHW6
{
	static float pi=3.14f;
	 static float circle_area(float radius)
	 {
		 return pi*radius*radius;
	 }
	  float circumference(double d)
	 {
		 return  (float) (2 * pi * d);
	 }
	public static void main(String[] args)
	{
		System.out.println( circle_area(19));
		circleHW6 c=new circleHW6();
		float num=c.circumference(20.9);
		System.out.println(num);
	}

}
