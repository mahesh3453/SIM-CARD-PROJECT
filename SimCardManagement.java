package com.nit.abstraction;

import java.util.Scanner;

interface SimCard{
	public long gettingPhoneNumber();
	public void networkProvider();
	public void activation();
	public void deActivation();
}
class Jio implements SimCard{

	
	@Override
	public long gettingPhoneNumber() {
		long num=(int)(Math.random()*4)+6;
		long rem = (long)(Math.random()*1000000000L);
		long fin = num * 1000000000L +rem;
		return fin;
	}

	@Override
	public void networkProvider() {
		System.out.println("Network Provider: Jio");
	}

	@Override
	public void activation() {
		System.out.println("SIM Activated !!!");
	}

	@Override
	public void deActivation() {
		System.out.println("SIM Deactivated !!!");
	}
	
}

class Airtel implements SimCard{
	
	@Override
	public long gettingPhoneNumber() {
		long num=(int)(Math.random()*4)+6;
		long rem = (long)(Math.random()*1000000000L);
		long fin = num * 1000000000L +rem;
		return fin;
	}

	@Override
	public void networkProvider() {
		System.out.println("Network Provider: Airtel");
	}

	@Override
	public void activation() {
		System.out.println("SIM Activated !!!");
	}

	@Override
	public void deActivation() {
		System.out.println("SIM Deactivated !!!");
	}
}

class BSNL implements SimCard{
	
	@Override
	public long gettingPhoneNumber() {
		long num=(int)(Math.random()*4)+6;
		long rem = (long)(Math.random()*1000000000L);
		long fin = num * 1000000000L +rem;
		return fin;
	}

	@Override
	public void networkProvider() {
		System.out.println("Network Provider: BSNL");
	}

	@Override
	public void activation() {
		System.out.println("SIM Activated !!!");
	}

	@Override
	public void deActivation() {
		System.out.println("SIM Deactivated !!!");
	}
}

interface IMobile{
	public void insertSim(SimCard sim);
	public void removeSim();
	public void makeCall(long mobileNo);
	public void sedText(long mobileNo,String msg);
}

class Iphone16 implements IMobile{

	private SimCard sim;
	
	@Override
	public void insertSim(SimCard sim) {
		if(this.sim == null) {
			this.sim = sim;
			System.out.println("Sim inserted successfully");
			sim.activation();
			System.out.println("Your new number is "+sim.gettingPhoneNumber());
			sim.networkProvider();
		}else {
			System.out.println("Sim is already present!!!");
		}
	}

	@Override
	public void removeSim() {
		if(this.sim != null) {
			sim.deActivation();
			this.sim = null;
		}else {
			System.out.println("SIM slot is empty");
		}
	}

	@Override
	public void makeCall(long mobileNo) {
		if(this.sim != null) {
			sim.networkProvider();
	        System.out.println("Making a call to " + mobileNo);
		}else {
			System.out.println("Insert the sim!!!!");
		}
	}

	@Override
	public void sedText(long mobileNo, String msg) {
		if(this.sim != null) {
			sim.networkProvider();
			System.out.println("Sending text to :"+mobileNo);
		}else {
			System.out.println("Sim is not present!!!!!!");
		}
	}
	
}

public class SimCardManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Iphone16 applephone = new Iphone16();
		System.out.println("Choose the Network Provider.");
		System.out.println("1] JIO");
		System.out.println("2] BSNL");
		System.out.println("3] Airtel");
		System.out.print("Enter your Choice [1,2,3]: ");
		int ch = Integer.parseInt(sc.nextLine());
		
		switch(ch) {
		case 1 -> {
			Jio jio = new Jio();
			applephone.insertSim(jio);
		}
		case 2 -> {
			BSNL bsnl = new BSNL();
			applephone.insertSim(bsnl);
		}
		case 3 -> {
			Airtel airtel = new Airtel();
			applephone.insertSim(airtel);
		}
		default -> {
			System.out.println("Invalid choice!!!!!!!!!!!");
		}
		}
		System.out.println("\n------Choose any option ------");
		System.out.println("1] Make call");
		System.out.println("2] Send messeage");
		System.out.println("3] Remove sim");
		System.out.print("Enter your choice[1,2,3]: ");
		int ch1 = Integer.parseInt(sc.nextLine());
		
		switch(ch1) {
		case 1 -> {
			System.out.print("Enter mobile no to call: ");
			long mobile = Long.parseLong(sc.nextLine());
			if(mobile<1000000000l || mobile>=10000000000l) {
				System.out.println("Invalid Mobile Number!!! can't make a call");
			}else {
			applephone.makeCall(mobile);
			}
		}
		case 2 -> {
			System.out.print("Enter mobile no to call: ");
			long mobile = Long.parseLong(sc.nextLine());
			if(mobile<1000000000l || mobile>=10000000000l) {
				System.out.println("Invalid Mobile Number!!! can't make a call");
			}
			System.out.println("Type your Message");
			String msg = sc.nextLine();
			applephone.sedText(mobile,msg);
		}
		case 3 -> {
			applephone.removeSim();
		}
		default -> {
			System.out.println("Invalid choice!!!!!!!!!!!");
		}
		}
		sc.close();
	}
}

