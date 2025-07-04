package ecommerce;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Items> cart = new ArrayList();
	
	public ArrayList<Items> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Items> cart) {
		this.cart = cart;
	}

	public void add(Product product, int quantity){
		if(product.getQuantity() < quantity){
			System.out.println("Only " + product.getQuantity() + " " + product.getName() + "(s) available in stock.");
		}
		Items i = new Items(product, quantity);
		cart.add(i);
	}
	
}
