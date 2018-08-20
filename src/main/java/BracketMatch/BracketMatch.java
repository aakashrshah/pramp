package main.java.BracketMatch;

public class BracketMatch {
	
	public int bracketMatch(String text) {
		
		int result = 0;
		char[] brackets = text.toCharArray();
		int counter = 0;
		
		for(int i=0;i < brackets.length;i++) {
			if(brackets[i] == '(') {
				counter++;
			}
			
			if(brackets[i] == ')') {
				counter--;
			}
			
			if(counter < 0) {
				counter++;
				result++;
			}
		}
		
		return counter + result;
	}
}
