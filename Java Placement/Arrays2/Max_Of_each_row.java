package day1;

public class Max_Of_each_row {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				arr[r][c]=r+c;			
			}
		}
		for(int r=0;r<arr.length;r++) {
			int max=arr[r][0];
			for(int c=0;c<arr[r].length;c++) {
				if(max<arr[r][c]) {
					max=arr[r][c];
				}
			}
			System.out.println(max);
		}
			
		for(int r[]:arr) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}
}
