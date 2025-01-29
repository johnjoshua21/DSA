package day1;

public class MaxofEachColumn {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int x=0;
		for(int c=0;c<arr.length;c++) {
			int sum=0;
			for(int r=0;r<arr[c].length;r++) {
				arr[r][c]=++x;
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
