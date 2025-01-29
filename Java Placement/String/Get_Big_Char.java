package Sep_4;
public class Get_Big_Char {
	public static void main(String[] args) {
		String st1="auy";
		String st2="gug";
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		String st3="";
		for(int i=0;i<(st1.length()<st2.length()?st1.length():st2.length());i++) {
			if(st1.charAt(i)>=st2.charAt(i) && Character.isAlphabetic(st1.charAt(i))) {
				st3+=st1.charAt(i);
			}
			else if (st1.charAt(i)<st2.charAt(i) && Character.isAlphabetic(st2.charAt(i))){
				st3+=st2.charAt(i);
			}
		}
		for(int i=0;i<st3.length();i++) {
			if(st3.charAt(i)=='a'||st3.charAt(i)=='e'||st3.charAt(i)=='i'||st3.charAt(i)=='o'||st3.charAt(i)=='u')
				
				st3=st3.replace(st3.charAt(i),'*');			
		}
		System.out.println(st3);			
	}
}