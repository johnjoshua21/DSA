package Day4;
public class PolyMorphism {

	//Method overloading
	void disp(String s) {
		System.out.print(s+" ");
	}
	void disp(int i) {
		System.out.print(i);
	}
	public static void main(String[] args) {
		PolyMorphism p1=new PolyMorphism();
		p1.disp("Reverse Swing");
		p1.disp(1);	
		NewClass p2=new NewClass();
		p2.disp();
		
	}
}

class NewClass extends PolyMorphism{
	//Method OverRiding
	void disp() {
		super.disp(5);
	}
}