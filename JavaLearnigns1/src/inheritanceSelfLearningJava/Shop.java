package inheritanceSelfLearningJava;

public class Shop {

	int shopID;
	String shopName;
	Goods goods;
	float balance;
	static Goods g1;
	static Goods g2;
	
	public Shop(int shopID, String shopName, Goods goods)
	{
		this.shopID=shopID;
		this.shopName=shopName;
		this.goods=goods;
		
	}
	
	void display()
	{
		System.out.println(shopID+" "+shopName+" "+balance);
		System.out.println(goods.itemID+" "+goods.itemName+" "+goods.itemPrice+" "+goods.status+" "+goods.paidAmount);
	}
	
	void sale()
	{
		this.balance= g1.setStatus("In Sale",0);
		this.balance= g2.setStatus("Sold-Out",10);
						
	}
	
	void profit()
	{
	
	}
	public static void main(String[] args) {
		g1=new Goods(111,"pens",10);
		g2=new Goods(112,"books",20);
		
		Shop s1=new Shop(1010,"Chinmayi Supper market",g1);
		Shop s2=new Shop(2020,"Star Supper market",g2);
		
		s1.sale();
		s2.sale();
		
		s1.display();
		s2.display();
		
		
		
		
		
	}

}
