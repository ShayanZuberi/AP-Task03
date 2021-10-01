import java.io.File;
import java.util.ArrayList;

public class Hotel {
	private int roomCount;	//room count will be room key
	private int booked;
	private int reserved;
	ArrayList<Room> rooms;
	
	Hotel(){
		rooms = new ArrayList<Room>();
		roomCount = 0;
		booked = 0;
		reserved = 0;
	}
	
	public void addRooms() {
		roomCount++;
		this.rooms.add(new Room(roomCount));
		roomCount++;
	}
	
	public void getAvailableRooms() {
		for(int i=0; i<roomCount; i++) {
			Room temp = new Room();
			temp = rooms.get(i);
			System.out.println("Room key: " + temp.getKey());
			System.out.println("Room capacity: " + temp.getCapacity());
			System.out.println("Room Charges: " + temp.getCharges());
			System.out.println("Room holder: " + temp.getName());
			
		}
	}
	
	public void writeToFile() {
		File file = new File("../records.txt");
		if(file.exists()) {
			for(int i=0; i<roomCount; i++) {
				Room temp = new Room();
				temp = rooms.get(i);
				System.out.println("Room key: " + temp.getKey());
				System.out.println("Room capacity: " + temp.getCapacity());
				System.out.println("Room Charges: " + temp.getCharges());
				System.out.println("Room holder: " + temp.getName());
				
			}
		}
	}
	
	public String searchGuest(int key) {
		Room temp = new Room();
		temp = rooms.get(key);
		return temp.getName();	//name of room holder returned
	}
	
	public void bookRoom(String name) {//HERE I WILL USE THE EXCEPTION
		try {
			Room temp = new Room();
			temp.book(name);
			rooms.set(booked, temp);
			booked++;
		}
		catch(CustomException e) {
			return;
		}
	}
	
	public void reservedRoom(String name) {
		rooms.get(reserved).book(name);
		reserved++;
	}
	
	public int getRoomCount() {
		return roomCount;
	}
		
}
