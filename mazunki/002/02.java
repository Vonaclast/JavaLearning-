class Car {

	public Car(int maxSpeed, String colour, boolean isEngineOn){
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.isEngineOn = isEngineOn;
	}

	public static void main(String[] args){

		Car toyota = new Car(180, "Red", false);
		
		return;
	}
}