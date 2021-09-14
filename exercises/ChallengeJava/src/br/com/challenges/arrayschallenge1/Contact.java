package br.com.challenges.arrayschallenge1;

import java.util.Objects;

public class Contact {

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	private String name;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static Contact createContato(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}

	public boolean equals(Contact contact) {
		if (this == contact) {
			return true;
		}
		if (contact == null || getClass() != contact.getClass()) {
			return false;
		}
		Contact contact1 = (Contact) contact;
		return Objects.equals(name, contact1.name)
				&& Objects.equals(phoneNumber, contact1.phoneNumber);
	}

	public int hashCode() {
		int result = 7;
		result = 31 * result + name.hashCode();
		result = 31 * result + phoneNumber.hashCode();
		return result;
	}
}
