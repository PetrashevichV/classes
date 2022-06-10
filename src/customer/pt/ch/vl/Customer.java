package customer.pt.ch.vl;

import java.util.Scanner;

public class Customer {
	private int id;
	private String surname, name, patronymic;
	private String address;
	private BankInfo bankInfo;

	public Customer(int id, String surname, String name, String patronymic, String address, int numOfCard,
			int numOfBankAccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		bankInfo = new BankInfo(numOfCard, numOfBankAccount);
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

//
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

//			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//
	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

//			
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	
	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfo BankInfo) {
		this.bankInfo = BankInfo;
	}
}