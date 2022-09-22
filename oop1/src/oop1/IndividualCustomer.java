package oop1;

// IndividualCustomer is an extensive of customer.
// Customer'ların genel özelliklerini taşır.
public class IndividualCustomer extends Customer {
	// sadece bireysel müşteriye ait field'lar girildi.
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
