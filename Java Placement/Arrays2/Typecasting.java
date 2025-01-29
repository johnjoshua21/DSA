package day1;

public class Typecasting {
	public static void main(String[] args) {
	int sum=0;
	int x=11;
	for(int i=2;i<=x/2;i++) {
		if(x%i==0) {
		System.out.println("Not a prime");
		sum++;
		break;
	}}
	if(sum==0)
		System.out.println("Prime");	
}}