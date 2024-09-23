package oopPrinciples.oopPractice.Encapsulation.Exercise_2;

public class Product {
	private String productName;
	private String productCode;
	private double price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public double applyDiscount(double percentage) {
	 	return ( this.price -= this.price * (percentage / 100));
		
	}
	
	
}
