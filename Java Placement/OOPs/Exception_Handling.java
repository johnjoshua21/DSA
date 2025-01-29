package Sep_4;
public class Exception_Handling {
	public static void main(String[] args) {
		int n=5;
		try {
			n/=0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finished");
		}
	}
}