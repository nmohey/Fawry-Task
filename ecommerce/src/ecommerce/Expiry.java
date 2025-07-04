package ecommerce;

import java.time.LocalDate;

public class Expiry extends Product {
	private LocalDate expiry;

	public Expiry(String name, double price, int quantity, LocalDate expiry) {
		super(name, price, quantity);
		this.expiry = expiry;
	}

	public LocalDate getExpiry() {
		return expiry;
	}
	
}
