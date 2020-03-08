package main.com.dos.ricevuta;

import java.util.ArrayList;
import java.util.List;

public class ShopRegister {

	protected List<Cart> carts;
	
	public ShopRegister() {
		this.carts = new ArrayList<Cart>();
	}
	
	public int countItems() {
		// TODO Auto-generated method stub
		return this.carts.size();
	}

	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		if(isMultipleTenCart()){
			cart.setLuckyBonus(true);
		}
		this.carts.add(cart);
	}
	
	protected boolean isMultipleTenCart() {
		return ((countItems()+1) % 10) == 0;
	}

	public Cart getLastCart() {
		// TODO Auto-generated method stub
		return this.carts.get(this.carts.size()-1);
	}

}
