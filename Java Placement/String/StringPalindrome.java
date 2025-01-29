package Day3;

public class StringPalindrome {

	public static void main(String[] args) {
		String ip="malayalam";
		String op=(rev(ip));
		if(ip.compareToIgnoreCase(op)==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");

}
	static String rev(String s) {
		StringBuffer sb=new StringBuffer(s);
		return sb.reverse().toString();
	}
}
