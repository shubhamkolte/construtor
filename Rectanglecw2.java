package Contructor;

public class Rectanglecw2 
{
	int length , width;
	public Rectanglecw2(int Length,int width)
	{
		this.length=Length;
		this.width=width;
	}
	
	 void rectangleArea()
	 {
		 System.out.println(" Area of Rctangle  : "+length*width);
	 }
	 void rectanglePerimeter()
	 {
		 System.out.println(" perimeter  :  "+2*length*width);
	 }
		public static void main(String[] args)
		{
		
			Rctanglecw2 r=new Rctanglecw2(12,12);
			r. rectangleArea()
		}
}