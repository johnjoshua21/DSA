package electricity_Billing_System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=1000;
		UserDetails db[]=new UserDetails[100];
		int choice=0;
		System.out.println("Welcome to our services\nWhat do You need from us");
		while(choice!=4) {
		
		System.out.println("\n\n1.Check Your Status");
		System.out.println("2.Register new Account(New Connection)");
		System.out.println("3.Remove Your Account");
		System.out.println("4.Exit");
		//System.out.println("4.Change Details");
	 	System.out.print("Please Enter Your Choice :");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:	
			System.out.print("Enter you id: ");
			int checkId=scanner.nextInt();
			try {
				db[checkId-1000].display();
			}
			catch(Exception e) {
				System.out.println("\nSorry Id Not found\n");
			}
			
			break;
		case 2:
			scanner.nextLine();
			System.out.print("\nEnter Your Name: ");
			String nx=scanner.nextLine();
//			scanner.nextLine();
			System.out.print("Enter Your Location: ");
			String ax=scanner.nextLine();
			System.out.print("Enter Your Mobile No: ");
			long px=scanner.nextLong();
			db[no-1000]=new UserDetails();
			db[no-1000].set(no++, nx, ax, px);
			break;
		case 3:
			System.out.print("Enter you id: ");
			int deleteId=scanner.nextInt();
			db[deleteId-1000].delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Enter Valid Choice");	
	}	
		}	
		System.out.println("Thank You");
		scanner.close();
}
}