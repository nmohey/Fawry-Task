package ecommerce;

public class Customer {
	private String name;
	private double balance;

	public Customer(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void updateBalance(double amount){
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
