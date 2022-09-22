package oop1;

public class Customer {
	// hem bireysel hem kurumsal müşteri
	private int id;
	private String customerNumber;
	// üzerinde matematiksel işlem yapmadığım değişkenleri,
	// long sayı olarak tanımlamaktansa string olarak tanımlarım.
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
