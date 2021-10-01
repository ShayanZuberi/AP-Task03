
public class Room {
	private int key;
	private int capacity;
	private int charges;
	private boolean reserved;
	private boolean booked;
	private Customer cust;
	
	Room(){
		cust = new Customer();
		key = -1;
		capacity = 2;
		charges = 1000;
		reserved = false;
		booked = false;
	}
	
	
	Room(int k){
		cust = new Customer();
		key = k;
		capacity = 2;
		charges = 1000;
		reserved = false;
		booked = false;
	}
	
	
	Room(int k, int c, int charg){
		cust = new Customer();
		key = k;
		capacity = c;
		charges = charg;
		reserved = false;	//always false initially
	}

	public void reserve() {
		this.reserved = true;
	}
	
	public void reserve(String name) {
		this.reserved = true;
		this.cust.setName(name);
	}
	
	public void book() {
		this.booked = true;
	}
	
	public void book(String name) {
		this.booked = true;
		this.cust.setName(name);
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getCharges() {
		return this.charges;
	}
	
	public void setCharges(int ch) {
		this.charges = ch;
	}
	
	public void free() {
		this.booked = false;
		this.reserved = false;
		this.cust.setName("anonymous");
	}
	
	public String getName() {
		return cust.getName();
	}
}
