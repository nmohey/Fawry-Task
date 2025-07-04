package ecommerce;

public class Ship extends Product implements Shippable {
	private double weight;
	
	public Ship(String name, double price, int quantity, double weight){
		super(name, price, quantity);
		this.weight = weight;
	}

	@Override
	public String getName() {
		return super.getName();	
	}

	@Override
	public double getWeight() {
		return weight;
	}
	
	
}
