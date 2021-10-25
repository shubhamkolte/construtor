package Contructor;

public class copyObjectCW5 
{
	int rn;
	String name;
	int marks;
	copyObjectCW5(copyObjectCW5 s)    //
	{
		this.rn=s.rn;
		this.name=s.name;
		this.marks=s.marks;
	}
	public copyObjectCW5(int rn,String name,int marks)
	{
		this.rn=rn;
		this.name=name;
		this.marks=marks;
	}
	public void print()
	{
		System.out.println(rn+"  "+" name "+marks);
	}
	public static void main(String[] args) 
	{
		copyObjectCW5 s1=new copyObjectCW5(1, "somu" , 40);
		s1.print();
		
		
		copyObjectCW5 s2=new copyObjectCW5(s1);  // copy s1 into s2 
		s2.print();    
		
		

		copyObjectCW5 s3=new copyObjectCW5(s2);  // copy s2 into s3 
		s3.print();    
		
		
		
	}

}
