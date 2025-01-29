package Sep_3;
import java.util.*;

class Acc{
	
	 Acc(int accno, String name2, long amount, long number) {
		this.Acc_NO=accno;
		this.Name=name2;
		this.balance=amount;
		this.Phone =number;
	}


	void getdetail() {
		System.out.println("Account no :"+Acc_NO);
		System.out.println("Account holder name "+Name);
		System.out.println("Account holder Phone no "+Phone);
		System.out.println("Account current balance "+balance);	
		System.out.println();
		System.out.println();
	}
	
	int Acc_NO;
	String Name;
	long balance;
	long Phone;
		
	long CheckBalance() {
		return balance;
	}
	
	void deposit(int amt) {
		balance+=amt;
		System.out.println("Your current Balance is "+balance);
	}
	
	void withdraw(int amt) {
		if(balance>=amt) {
			balance-=amt;
			System.out.println("Your current Balance is "+balance);
		}
		else {
			System.out.println("You Dont have sufficient balance");
		}
		
		
	}
}

public class Bank {

	public static void main(String[] args) {
	Acc arrobj[]=new Acc[10];
	int accno=1000;
		
	Scanner sc=new Scanner(System.in);
	

		while(true) {
			
			System.out.print("\n1.Create Account\n2.Get Details\n3.Check Balance"
					+ "\n4.Withdraw\n5.Deposit\n6.Quit\n");
			System.out.print("\nEnter What do u want to do :");
			int opt=sc.nextInt();
		if(opt==1) {
			System.out.print("Enter your name :");
			String name=sc.next();
			System.out.print("Initial Deposit :");
			long amount=sc.nextLong();
			System.out.print("Enter your Phone no :");
			long number=sc.nextLong();
			arrobj[accno-1000]=new Acc(accno,name,amount,number);
			accno++;
			System.out.println("Account Created Successfully");
			System.out.println("And Your Account number is "+(accno-1)+"\n Please kindly note this");
		}	
		else if(opt==2) {
			System.out.print("Enter your Account no :");
			int accountnumber=sc.nextInt();
			arrobj[accountnumber-1000].getdetail();
		}
		
		else if(opt==3){
			System.out.print("Enter your Account no :");
			int accountno=sc.nextInt();
			System.out.print(arrobj[accountno-1000].CheckBalance());
		}
		else if(opt==4) {
			System.out.print("Enter your Account no :");
			int accountnofwd=sc.nextInt();
			System.out.print("Enter Amount to withdraw :");
			arrobj[accountnofwd-1000].withdraw(sc.nextInt());
		}
		else if(opt==5) {
			System.out.print("Enter your Account no :");
			int accountnofde=sc.nextInt();
			System.out.print("Enter Amount to deposit :");
			arrobj[accountnofde-1000].deposit(sc.nextInt());
		}
		else if(opt==6) {
			System.out.println("Exiting.......");
			break;
		}	
		}
	}	
	}