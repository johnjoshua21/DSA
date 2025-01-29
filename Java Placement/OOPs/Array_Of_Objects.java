package Sep_3;
import java.util.Scanner;
class AccOUNT{
	String Name;
	int Roll_no;
	AccOUNT(String name,int roll){
		Name=name;
		Roll_no=roll;
	}
	AccOUNT(){
		
	}
	
	void getname() {
		System.out.println(Name);
	}
}

public class Array_Of_Objects {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccOUNT obj[]=new AccOUNT[3];
		for(int i=0;i<obj.length;i++) {
			System.out.print("Enter name:");
			obj[i]=new AccOUNT(sc.nextLine(),i);
		}		
	}
}
