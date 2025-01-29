package Aug_31;

public class Rotate_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		for(int j=0;j<2;j++) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		}
		
		for(int k:arr)
			System.out.println(k);

	}

}
