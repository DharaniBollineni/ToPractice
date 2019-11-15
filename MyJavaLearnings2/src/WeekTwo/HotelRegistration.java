package WeekTwo;

import java.util.ArrayList;
import java.util.List;

import ecs100.UI;

public class HotelRegistration {

	List<String> guests = new ArrayList<>();
	public static int MAX_ROOM = 10;

	public HotelRegistration() {

		// initialise empty for all rooms
		for (int i = 0; i < MAX_ROOM; i++) {
			guests.add(null);
		}
		UI.initialise();
		UI.addButton("Add guests", this::addGuests);
		UI.addButton("Display guests", this::displayguests);
		UI.addButton("Checkout", this::checkOutButton);
	}

	public void addGuests() {
		int roomNum;
		String name;
		if (!checkAvailablity()) 
		{
			UI.println("No rooms available");
		}else
		{
			availableRooms();
			roomNum = UI.askInt("Enter room number 1 to 10");
			name = UI.askString("Enter the guest name");
			assignRoom(roomNum-1, name);
		}  
	}

	private void availableRooms() {
		int i=0;
		UI.print("Available rooms are :: ");
		for (String r:guests)
		{
			if(!(r==null))
			{
				UI.printf("%d %n", i+1);
			}
			i++;
		}
		
	}

	public boolean checkAvailablity() {
		for(int i=0;i<guests.size();i++)
		{
			if (guests.get(i)==null) {
				return true;
			}
		}
		return false;

	}

	public void assignRoom(int roomNum, String name) {
		this.guests.set(roomNum, name);

	}
	
	public void displayguests()
	{
		UI.println("Rooms Details:: \n --------------------------------------------------\nRoomNumber::::::::Name");
		for(int i=0;i<guests.size();i++ )
		{
			UI.printf("%d	 	%s%n",i+1,guests.get(i));
		}
	}
	public void checkOutButton() {
		int roomNum=UI.askInt("Enter the room number");
		String name=UI.askString("Enter the name ");
		if(checkOut(roomNum,name))
		{
			UI.println("CheckOut is successful");
		}
		else
		{
			UI.println("Please check CheckOut is not successful");
		}
	}
	public boolean checkOut(int roomNum,String name)
	{
		for(int i=0;i<guests.size();i++)
		{
			if(i+1==roomNum)
			{
				if (this.guests.get(i) != null  &&  this.guests.get(i).equals(name))
				{
					this.guests.set(i, null);
					return true;
				}
				
			}
			
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HotelRegistration();
	}

}
