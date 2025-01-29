package Day3;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		String s="Helloheveryone";
		int arr[]=new int[26];
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
				arr[c-'a']++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println((char)(i+97)+":"+arr[i]);
		}
	}
}