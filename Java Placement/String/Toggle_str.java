package Aug_31;

import java.util.Scanner;

public class Toggle_str {

	public static void main(String[] args) {
		String st="John Joshua";
		char[] ch=st.toCharArray();
		int i=0;
		while(i<ch.length){
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
			i++;
			}
		
			for(char c:ch) {
				System.out.print(c);
	}
	}}
