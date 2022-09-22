package oop1;

// class'lar PascalCase olarak sınıflandırılır.
public class Product {
	// camelCase
	// sadece okunabilir ya da sadece yazılabilir olması açısından 'private' olarak tanımlarız.
	// 'private' bu class'a özel anlamındadır.
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl; // çok goruntusu varsa String[] imageUrls;
	private int unitsInStock;
	
	// get ve set işlemlerini tanımlamak için;
	// sağ click - source - generate getters and setters - select all - ok
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	// ayrıca okurken ekstra indirim yapmak istersem;
	// aşağıdaki comment satırını koda dahil edebilirim.
	public double getDiscount() {
		// discount = discount + 5
		return discount;
	}
	// ileride discount verisi sadece okunabilsin yapmak istersek;
	// aşağıdaki setDiscount işlemini tamamen kaldırabiliriz.
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	// private olarak tanımlanınca main class'ın altında kullanamıyoruz artık
	// get ve set işlemlerini artık ayrı ayrı yapan operasyonlarla kullanıma açmalıyım ya açmamalıyım.
	

	
}
