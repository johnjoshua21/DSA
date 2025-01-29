package day1;

public class Array_Multiplication {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int res[][]=new int[3][3];
		if (arr1.length!=arr2[0].length)
			return;
		int r=arr1.length;
		int c=arr1[0].length;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				int s=0;
				for(int k=0;k<r;k++) {
				s+=arr1[i][k]*arr2[k][j];
			}
				res[i][j]=s;
				if(s>100)
					System.out.print(s+" ");
				else
					System.out.print(s+"  ");
		}
			System.out.println();
		}
	}
}