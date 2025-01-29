package Sep_2;
import java.util.Arrays;
public class Most_Occured_no {
	public static void main(String[] args) {
		int arr[]= {1,1,1,4,4,4,5,6,6,8,9,9,9,9};
		Arrays.sort(arr);
	
		int count=1;
		int max=arr[0];
		int precount=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				count=1;
			}
			if(count>=precount) {
				precount = count;
				max=arr[i-1];
				
			}
			
			
		}
		System.out.println(max);
	}
}