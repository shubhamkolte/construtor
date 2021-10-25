package Contructor;

class Area

{
	Area(float pi,float r)
	{
		System.out.println(2*pi*r);
	}
}
class circle
{
	circle(float pi, float r)
	{
		System.out.println(" circle"+2*pi*(r*r));
	}
}
public class ShapeCircleHW5 {
	
	float pi=3.14f;
	float radius;
	ShapeCircleHW5(float radius)
	{
		this.radius=radius;
	}
	ShapeCircleHW5(float radius,float pi)
	{
		this.radius=radius;
		pi=this.pi;
		circle circl=new circle(pi,radius);
		Area a=new Area(pi,radius);
	}
	
	

	public static void main(String[] args)
	{
		ShapeCircleHW5 Shape=new ShapeCircleHW5(22,11.2f);
	}

}
