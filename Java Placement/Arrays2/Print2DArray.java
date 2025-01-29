package day1;

public class Print2DArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		for(int r=0;r<arr.length;r++) {
			int sum=0;
			for(int c=0;c<arr[r].length;c++) {
				arr[r][c]=r+c+1;
				sum+=arr[r][c];			
			}
			System.out.println(sum);
		}
		
		for(int r[]:arr) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
