package program;

public class Solution {
	
	
	public int sumtwoVals(int a, int b) {
		
		
		return a + b ;
	}
	
	public String evenorOdd(int a) {
		if (a % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}	
	}
	
	public String finalBoss(String a) {
	
		
		if (a.length() > 10 ) {
			
			char first_char = a.charAt(0);
			char last_char = a.charAt(a.length()-1);
			String middle = a.substring(1,a.length()-1).length() + "";
			
			return first_char + middle + last_char;	
			
		} else {
			return a; 
		}
	} 

}
	
