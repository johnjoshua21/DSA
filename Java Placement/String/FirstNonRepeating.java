package Day3;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String s="Hello everyone";
		s=s.toLowerCase();		
		for(int i=0;i<s.length();i++) {
			boolean flag=true;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)&&i!=j) {
					flag=false;
					//System.out.println(flag);
					break;
				}
			}
			if(flag) {
				System.out.println(s.charAt(i));
			break;}
		}
	}

}
