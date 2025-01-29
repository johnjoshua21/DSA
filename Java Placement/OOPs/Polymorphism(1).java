package Sep_3;
//Method overloading
class Poly{
	int num=15; 
	static void func(int a,int b) {
		System.out.println(a+b);
	}
}
//Method overriding
class Overload extends Poly{
	static void func(int a,int b) {
		System.out.println(a*b);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Poly ply= new Poly();
		Overload ovl=new Overload();
		Poly.func(2, 3);
		Overload.func(2, 3);
		System.out.println(ovl.num);
	}
}
