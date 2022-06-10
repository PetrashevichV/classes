package main.pt.ch.vl;

import java.util.ArrayList;
import java.util.Scanner;

import bankinfo.pt.ch.vl;
import customer.pt.ch.vl;

import java.util.ArrayList;
import java.util.Scanner;

import by.epam.tr.cust.BankInfo;
import by.epam.tr.cust.Customer;

public class mainCust {
	public static void main(String[] args) {

		Customer[] customers = new Customer[] {
				new Customer(107, "Petrashevich", "Vladimir", "Sergeevich", "Breskaya,85", 1000, 129),
				new Customer(203, "Mazgo", "Ksenya", "Aleksandrovna", "Pritytskova,101", 1290, 111),
				new Customer(10, "Ptashuk", "Aleksey", "Sergeevich", "Nezalezhnasti,102", 123, 237),
				new Customer(108, "Petrashevich", "Ksenya", "Vasylevna", "Kolotushkina,208", 45, 4866) };
		print(customers);
		System.out.println("--------------------------");
		sort(customers);
		System.out.println("--------------------------");
		listByNumber(customers);
	}

	public static String toString(Customer cust) {
		String str;
		str = "{" + cust.getID() + "}{" + cust.getSurname() + "}{" + cust.getName() + "}{" + cust.getPatronymic() + "}{"
				+ cust.getAddress() + "}{" + cust.getBankInfo().getNumOfCard() + "}{"
				+ cust.getBankInfo().getNumOfBankAccount() + "}";
		return str;
	}

	public static void print(Customer[] customers) {
		for (int i = 0; i < customers.length; i++)
			System.out.println(toString(customers[i]));
	}

	public static void sort(Customer[] customers) {
		Customer temp;
		for (int i = 0; i < customers.length; i++) {
			for (int j = i + 1; j < customers.length; j++) {
				if (customers[i].getSurname().charAt(0) > customers[i + 1].getSurname().charAt(0)) {
					temp = customers[i];
					customers[i] = customers[i + 1];
					customers[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < customers.length; i++) {
			System.out.println(toString(customers[i]));
		}
	}

	public static void listByNumber(Customer[] customers) {
		ArrayList<String> listOfCustomers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ââåäèòå èíòåðâàë: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getBankInfo().getNumOfCard() > n && customers[i].getBankInfo().getNumOfCard() < m) {
				listOfCustomers.add(toString(customers[i]));
			}

		}
		for (int i = 0; i < listOfCustomers.size(); i++)
			System.out.println(listOfCustomers.get(i));
	}
}
