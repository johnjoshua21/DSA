package Aug_31;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String st=sc.next();
		String temp=st.toUpperCase();
		StringBuffer sbf=new StringBuffer(temp);
		String res=sbf.reverse().toString();
		System.out.println(temp.equals(res)?"Palindrome":"Not a Palindrome");
	}
}
