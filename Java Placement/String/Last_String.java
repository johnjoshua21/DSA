package Aug_31;

public class Last_String {

	public static void main(String[] args) {
		String st="5334 54646 malayalam";
		String arr[]=st.split(" ");
		String str=arr[arr.length-1];
		StringBuffer sbf=new StringBuffer(str);
		str=sbf.reverse().toString();
		arr[arr.length-1]=str;
		for(String l:arr)
			System.out.print(l+" ");
	}
}