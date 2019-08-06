import java.util.Scanner;

public class Billing {
	
	public static void main(String[] args) {
		double price = 10;
		int quanity = 3;
		double coupon = .5;
		
		
		computeBill(price);
		computeBill(price, quanity);
		computeBill(price, quanity, coupon);
	}
	
	public static void computeBill(double price){
		double totalPrice;
		final double TAX = 1.08;
		
		totalPrice = price * TAX;
		
		System.out.println("The total price is " + totalPrice);
		
	}
	
	public static void computeBill(double price, int qty){
		double totalPrice;
		final double TAX = 1.08;
		
		totalPrice = (price*qty)*TAX;
		
		System.out.println("The total price with quantity is " + totalPrice);
		
	}
	
	public static void computeBill(double price, int qty, double cpn){
		double totalPrice;
		final double TAX = 1.08;
		
		totalPrice = ((price*qty)*qty)*cpn;
		
		System.out.println("The total price with quantity and a coupon code is" + totalPrice);
		
		
	}
	
}