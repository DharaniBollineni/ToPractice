package WeekTwo;

import java.util.ArrayList;

import ecs100.UI;

public class MethodsOnArrayList {
	private ArrayList<String> balloons = new ArrayList<String>();
	private ArrayList<Integer> orderList = new ArrayList<Integer>();
	
	
	public MethodsOnArrayList() {
		// TODO Auto-generated constructor stub
		UI.initialise();
		UI.addButton("Add Balloons", this::addBalloon);
		//UI.addButton("Display Ballons",this::displayBalloons);
		//UI.addButton("Remove Balloon",this::removeBalloon);
		
		// Related to orderList
		UI.addTextField ("Add orders",this::addOrders);
		UI.addButton("Display order",this::displayOrder);
		UI.addButton("Insert",this::insertOrder);
		UI.addButton("Swap orders", this::swapOrders);
		UI.addTextField("Check and delete the order", this::checkDeleteOrder);
		UI.addTextField("Waiting List number",this::waitingList);
		
		// Related to swap elments in the list
		
		
		}
public void addBalloon()
{
	//balloons.add(new Balloon(x,y,color));                             ----> check DDDD
	
}
public void addOrders(String ord)
{
	this.orderList.add(Integer.valueOf(ord));
}

public void displayOrder()
{
	for(Integer n: orderList )
	{
		UI.println(n);
	}
}

public void insertOrder()
{
	Integer item=10;
	int pos = UI.askInt("Enter position where do you want order "+ item +"\nto be inserted list size is " + this.orderList.size());
	this.orderList.add(pos,item);
}



public void swapOrders()
{
	
	Integer order1 = UI.askInt("Enter order1");
	Integer order2 = UI.askInt("Enter order2");
	if(!this.orderList.isEmpty())
	{
		if(this.orderList.contains(order1)&& this.orderList.contains(order2))
		{
			Integer temp,index1,index2;
			index1 = this.orderList.indexOf(order1);
			index2 = this.orderList.indexOf(order2);
			if(index1!=index2)
			{
				//temp = this.orderList.get(index1);
				//this.orderList.set(index1,this.orderList.get(index2));
				//this.orderList.set(index2, temp);
				this.orderList.set(index1, this.orderList.set(index2,this.orderList.get(index1)));
			}
		}
		else
		{
			UI.println("Empty Order List");
		}
		
	}
}
public boolean checkEmpltyList()
{
	if(this.orderList.isEmpty())
	{
		return true;
	}
	return false;
}

public void checkDeleteOrder(String oStr)
{
	if(this.checkEmpltyList())
	{
		 UI.println("Empty Order List");
	}
	else
	{
		if(!this.orderList.remove(Integer.valueOf(oStr)))
		{
			UI.printf("%s is not present in the list %n",oStr);
		}
		else
		{
			this.displayOrder();
		}
	}
	
}
public void waitingList(String wStr)
{
	if(this.checkEmpltyList())
	{
		 UI.println("Empty Order List");
	}
	else
	{
		if(!wStr.isEmpty() && this.orderList.contains(Integer.valueOf(wStr)) )
		{
			int i = this.orderList.indexOf(Integer.valueOf(wStr));
			UI.printf("order %s is at the waiting lsit %d %n",wStr,i+1);
					
		}
		else 
		{
			UI.println(wStr+" is not available");
		}
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new MethodsOnArrayList();
	}

}
