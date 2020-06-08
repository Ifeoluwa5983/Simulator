package classwork;

public class Simulator {
	private int temperature;
	private String color;
	private double capacity;
	private boolean condition;
	
	
	
	public Simulator(int temperature, String color, double capacity, boolean condition) {
		this.temperature=temperature;
		this.color=color;
		this.capacity=capacity;
		this.condition=condition;
	}
	public void setTemperature(int temperature) {
		this.temperature=temperature;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setCapacity(double capacity) {
		this.capacity=capacity;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCondition(boolean condition) {
		this.condition=condition;
	}
	public boolean getCondition() {
	    return condition;
	}
	public int getSimulateAc() {
		if(condition == true) {
			System.out.println("The switch is on");
		}
			else{
				System.out.println("The switch is off");
			}
		if(temperature < 25 && temperature > 16) {
				System.out.println("Operation can be performed");
				temperature = temperature + 1;
		}
				else{
					System.out.println("Operation cannot be performed");
			
			}
		return temperature;
	}	
	}
