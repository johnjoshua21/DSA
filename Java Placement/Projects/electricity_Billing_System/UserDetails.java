package electricity_Billing_System;

public class UserDetails {
	int Id;
	String Name;
	String Location;
	String Address;
	long mobile;
	double units;
	double rate;
	
	void set(int Id,String Name,String Location,long mobile) {
		this.Id=Id;
		this.Name=Name;
		this.Location=Location;
		this.mobile=mobile;
		this.units=0.0;
		this.rate=0.0;
		display();
		unitCount();
	}
	void display(){
		if(this.Id!=0) {
			System.out.println("\nUser Details\n");
			System.out.print("Your Id: ");
			System.out.println(this.Id);
			System.out.print("Name: ");
			System.out.println(this.Name);
			System.out.print("Your Location: ");
			System.out.println(this.Location);
			System.out.print("Your Contact No: ");
			System.out.println(this.mobile);
			System.out.print("Units used: ");
			System.out.println(this.units);
			System.out.print("Amount need to pay: ");
			System.out.println(calculateUnit(this.units));
		}
		else {
			System.out.println("No Details Found");
		}
		
	}
	double calculateUnit(double units) {
		if(units<=100)
			return units*2;
		else if(units>100&&units<=300) {
			return 200+(units-100)*3;
		}
		else {
			return 200+600+(units-300)*5;
		}
	}
	public void delete() {
		this.Id=0;
		this.Name=null;
		this.Location=null;
		this.mobile=0;
		this.units=0.0;
		this.rate=0.0;
		
	}
	void unitCount() {
		this.units=(0 + (int)(Math.random() * ((100 - 0) + 1)));
	}
}
