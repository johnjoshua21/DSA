package day1;

public class SumofEachColumn {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int x=0;
		for(int c=0;c<arr.length;c++) {
			int max=arr[c][0];
			for(int r=0;r<arr[c].length;r++) {
				arr[r][c]=++x;
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
