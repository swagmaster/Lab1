public   class Car {
	
	private int odometer= 170000;
	private String make="Toyota"; 
	private String model="Camry";
	
	public Car (String newMake) {
		make = newMake;
	}
	
	
	
	public Car (String newMake, String newModel) {
		make = newMake;
		model = newModel;
		  
	}
	
	public static void main(String[] args) {
		
		//Two car objects
		Car c1 = new Car("Chevy");
		Car c2 = new Car("Audi", "R8");
		
		
		c1.toString();	
		c2.toString();
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//The object c1 that constructs a Car object
		//is calling the printAddress method which returns
		//the reference to c1 through 'this' as a string.
		c1.printAddress();
		
		c1.printAddressPriv();
		
		System.out.println(c1.odometer);
		System.out.println(c1.make + "," + c1.model);
		
		System.out.println("Make: " + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Miles(Odometer): " + c1.getOdometer());
		
		
		System.out.println(c1.toString());
		
	}
	
	//Basic method that returns 'this' as a String object
	public void printAddress() {
		System.out.println(this.toString());
	}
	
	//This is an identical method as printAdress
	//but is declared private
	private void printAddressPriv() {
		System.out.println(this.toString());
	}

	public int getOdometer() {
		return odometer;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	//toString method puts the data into one full string
	public String toString() {
		return "Make: " + getMake() + " Model: " + getModel() + " Miles(Odometer): " + getOdometer();
	}
}

