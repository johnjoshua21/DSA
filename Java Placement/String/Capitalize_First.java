package Aug_31;

public class Capitalize_First {

	public static void main(String[] args) {
		String st="john joshua is from podanur";
		String arr[]=st.split(" ");
		String res="";
		int i=0;
		for(String s:arr) {
			s=s.substring(0,1).toUpperCase()+ s.substring(1).toLowerCase();
			res=res+s+" ";
		}
	
			System.out.print(res);
}
}