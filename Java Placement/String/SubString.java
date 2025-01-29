package Day3;
public class SubString {
	public static void main(String[] args) {
		String str="aab";
		int count=1;
		String fres="";
		int max=0;
		A:
		for(int i=0;i<str.length();i++) {
			String res=""+str.charAt(i);
			System.out.println(res);
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if((res.indexOf(str.charAt(j)))==-1){
					res+=str.charAt(j);
					count++;
				}
				else {
					if(count>max) {
						max=count;
						fres=res;
					}
					i=j-1;
					break;
				}
//				if(res.length()==str.length()) {
//					fres=str;
//					max=str.length();
//					break A;
//					}
			}
		}
		
		System.out.println(fres);
		System.out.println(max);
	}
}
