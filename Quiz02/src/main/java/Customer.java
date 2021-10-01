
public class Customer {
	private String name;
	
	Customer(){
		setName("anonymous");
	}
	
	Customer(String n){
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
