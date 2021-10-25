package Contructor;

public class student
{
	int rn;
	int marks;
	String name;
	student(int roll,String name1,int marks)
	{
		rn=roll;
		this.marks=marks;
		name=name1;
	}
	student(int newroll)
	{
		rn=newroll;
	}
	student(int roll,String name1)
	{
		rn=roll;
		name=name1;
	}
	void print()
	{
		System.out.println(rn+"  "+name+"  "+marks);
	}
	public static void main(String[] args) 
	{
		student s3= new student(3); 
		s3.print(); 
	
	student s2= new student(2,"shubham "); 
	s2.print();
	
	
	student s1= new student(3,"mohan ",8); 
	s1.print();
}
	}
