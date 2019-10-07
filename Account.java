//Luca Lombardo
//CSC 236-64
//Lab 1-A

import java.util.*;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate/100;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	public void withdraw(double withdrawal) {
		balance = balance - withdrawal;
	}
	
	public void deposit(double deposited) {
		balance = balance + deposited;
	}
}