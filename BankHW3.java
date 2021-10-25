package Contructor;

public class BankHW3 
{

	int amount=5000;
	public BankHW3() {	}
	BankHW3(int amount)
	{
		this.amount=this.amount+amount;
	}
	void finalAmount()
	{
		System.out.println(" final Amount = "+ amount);
	}
	

	
	
	public static void main(String[] args) 
	{
		BankHW3 b=new BankHW3();
		b.finalAmount();
		
		BankHW3 b1=new BankHW3(5000);
		b1.finalAmount();
		
		
	}

}
