package Sep_3;

class NGPEngg{
	NGPEngg(){
		System.out.println("College created");
	}
	static void principal() {
		System.out.println("Hi I'm principal, From Coimbatore");
		
	}
	
	static class ECE{
		void HOD() {
			System.out.println("Hi I'm HOD, From Coimbatore");
		}
			void check() {
				principal();
			// If we call inside a static class the method need to be Static
			}
		
	}
	class CSE{		
		void HOD() {
			System.out.println("Hi I'm HOD, From Coimbatore");
		}
	}	
}


public class Nested_class {

	public static void main(String[] args) {
		NGPEngg obj=new NGPEngg();
		NGPEngg.ECE ece=new NGPEngg.ECE();
		NGPEngg.CSE cse=obj.new CSE();		
	}
}