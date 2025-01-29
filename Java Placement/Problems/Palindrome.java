package Leet;
public class Palindrome {
	    public boolean isPalindrome(int x) {
	        int y=x;
	        int last=0;
	        while (x>0){
	            int rem=x%10;
	             last=last*10+rem;
	             x=x/10;
	        }
	        if (last==y){
	            return true;
	        }
	        else {
	            return false;
	        }
	        
	    }
}
