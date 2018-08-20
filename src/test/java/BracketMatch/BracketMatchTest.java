package test.java.BracketMatch;

import org.junit.Assert;
import org.junit.Test;

import main.java.BracketMatch.BracketMatch;

public class BracketMatchTest {
	
	BracketMatch b = new BracketMatch();

	@Test	
	public void testBracketMatch() {
		String text = "((";
		int expectedAnswer = 2;
		Assert.assertEquals(expectedAnswer, b.bracketMatch(text));
	}
	
	@Test	
	public void testBracketMatchTwo() {
		String text = "(())";
		int expectedAnswer = 0;
		Assert.assertEquals(expectedAnswer, b.bracketMatch(text));
	}
	
	@Test	
	public void testBracketMatchTHree() {
		String text = "(())()";
		int expectedAnswer = 0;
		Assert.assertEquals(expectedAnswer, b.bracketMatch(text));
	}
	
	@Test	
	public void testBracketMatchFour() {
		String text = "(())(";
		int expectedAnswer = 1;
		Assert.assertEquals(expectedAnswer, b.bracketMatch(text));
	}
	
	
}
