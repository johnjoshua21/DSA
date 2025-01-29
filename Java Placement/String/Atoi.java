package Day3;

public class Atoi {

	 static Integer meth(String s){
		String res="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			System.out.println(Character.isDigit(c));
			if(Character.isDigit(c)||c=='-'||c=='+') {
				res+=c;
				//System.out.println(res);
			}
			break;
		}
		int i=Integer.parseInt(s); 
		return i;
	}
	 public static void main(String[] args) {
		 System.out.println(meth("-042"));
	 }

}
