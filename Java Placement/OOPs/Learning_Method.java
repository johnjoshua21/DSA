package Sep_2;
public class Learning_Method { 
	String add(char a[],char b[]) {
		return String.valueOf(a) + String.valueOf(b);	
	}	
	void sub() {
		int a=8;
		int b=4;
		System.out.println(a-b);
	}	
	float mul() {
		float a=5.5f;
		float b=5.5f;
		return a*b;
	}	
	
	void div(double a,double b) {
		System.out.println(a/b);		
	}

	
	public static void main(String[] args) {
		Learning_Method obj=new Learning_Method();
		Learning_Method obj1=new Learning_Method();

		char a[]= {'j','o'};
		char b[]= {'h','n'};
		System.out.println(obj.add(a,b));
		obj.sub();
		System.out.println(obj.mul());
		obj.div(10.0,2.0);
		obj1.div(14.0,7.0);
	}	
}