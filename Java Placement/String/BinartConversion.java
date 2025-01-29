package Day3;

public class BinartConversion {

	public static void main(String[] args) {
		System.out.println(convertDateToBinary("2024-11-07"));

	}
	public static String convertDateToBinary(String date) {
	       String[] Str=date.split("-"); 
	       String res="";
	       for(int i=0;i<Str.length-1;i++){
	            int x=Integer.parseInt(Str[i]);
	            res=res+binaryConversion(x)+"-";
	       }
	       return res+binaryConversion(Integer.parseInt(Str[Str.length-1]));
	    }
	    public static String binaryConversion(int decimalNumber) {
			String binary = Integer.toBinaryString(decimalNumber);
	        return binary;
		}
}
