package ecommerce;

import java.time.LocalDate;

public class Expiry_Ship extends Product implements Shippable {
	private LocalDate expiry;
	private double weight;
	
	public Expiry_Ship(String name, double price, int quantity, LocalDate expiry, double weight){
		super(name, price, quantity);
		this.expiry = expiry;
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

	public LocalDate getExpiry() {
		return expiry;
	}
	
}
