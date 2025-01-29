package Aug_31;

public class Vowels_To_Star {

	public static void main(String[] args) {
		String st="john joshua is from podanur";
		char[] ch=st.toCharArray();
		int i=0;
		while(i<ch.length) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
				ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]=(char)42;
			}
			i++;	
		}
		for(char c:ch) {
			System.out.print(c);
	}
	}
}
