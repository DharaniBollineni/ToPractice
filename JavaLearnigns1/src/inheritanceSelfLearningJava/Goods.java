package inheritanceSelfLearningJava;

public class Goods {

	int itemID;
	String itemName;
	float itemPrice, paidAmount, balance;
	String status;
	
	public Goods(int itemID,String itemName,float itemPrice)
	{
		this.itemID=itemID;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
	}
	
	float setStatus(String status,float paidAmount)
	{
		this.status=status;
		this.paidAmount=paidAmount;		
		this.balance=itemPrice-paidAmount;
		return balance;
		
		
	}
	
}
