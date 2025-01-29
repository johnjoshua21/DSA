package Sep_2;

public class Equals_EithoutBuiltin {
public static void main(String[] args) {
	String st1="john joshua";
	String st2="john Joshua";
	int len=st1.length()<st2.length()?st1.length():st2.length();
	int flag=0;
	for(int i=0;i<len;i++) {
		if(st1.charAt(i)==st2.charAt(i))
			continue;
		else {
			flag=1;
			break;
		}
	}
	System.out.println(flag==0);
}
}
