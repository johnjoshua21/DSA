package Day4;

public class OOPs {
	String name;
	
	OOPs(){
		System.out.println("NO parameter");
	}
	
	OOPs(String name){
		this();
		this.name=name;
		System.out.println("Hi I'm "+this.name);
	}
	
	OOPs(int j){
		System.out.println("My no is "+j);
	}
	
	OOPs(String s,long j){
		System.out.println("Hi i'm "+s+" and i'm "+j);
	}
	
	void disp() {
		//2
		System.out.println("Hi I'm "+this.name);
	}
	void meth() {
		this.disp();
	}

	
	public static void main(String[] args) {
		OOPs obj0=new OOPs("Paad");
		//OOPs obj1=new OOPs("Paad",9);
		//OOPs obj2=new OOPs("ay",702160);
		//obj0.disp();
		//obj0.meth();
	}
}