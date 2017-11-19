package com.bmpl.inheritance;

class Bank{
	
	void deposit(){
		System.out.println("deposit amount");
	}
	
	void withdraw(){
		System.out.println("Withdraw amount");
	}
	
	void balanceCheck(){
		System.out.println("Check balance");
	}
}


class PNB extends Bank{
	
	void doorToDoorService(){
		System.out.println("Door to door service");
	}
}

class ICICI extends Bank{
	
	void rateOfInterest(){
		System.out.println("Rate of interest is 8%");
	}
}

public class HieraricalInheritance {

	
	public static void main(String[] args) {
		
		PNB pnb = new PNB();
		pnb.balanceCheck();
		pnb.deposit();
		pnb.doorToDoorService();
		pnb.withdraw();
		
		
		ICICI icici = new ICICI();
		icici.balanceCheck();
		icici.deposit();
		icici.rateOfInterest();
		icici.withdraw();
	}

}
