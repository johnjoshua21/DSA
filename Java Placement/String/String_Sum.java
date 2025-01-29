package Day3;

import java.util.Arrays;

public class String_Sum {

	public static void main(String[] args) {
		String str="hello everyone";
		String sArr[]=str.split(" ");
		for(int i=0;i<sArr.length;i++) {
			sArr[i]=rev(sArr[i]);
		}
		System.out.println(Arrays.toString(sArr));
	}
	public static String rev(String s) {
		String h="";
		for(int j=s.length()-1;j>=0;j--) {
			char ch=s.charAt(j);
			h+=ch;
		}
		return h;
	}
}