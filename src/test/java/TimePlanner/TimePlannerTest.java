package test.java.TimePlanner;

import org.junit.Assert;
import org.junit.Test;

import main.java.TimePlanner.TimePlanner;

public class TimePlannerTest {
	
	
	@Test
	public void testAllNull() {
		int[][] slotsA = {};
		int[][] slotsB = {};
		int dur = 8;
		int[] expectedOutput  = null;
		Assert.assertArrayEquals(expectedOutput, TimePlanner.meetingPlanner(slotsA, slotsB, dur));
	}
	
	@Test
	public void testNull() {
		int[][] slotsA = {{10, 50}, {60, 120}, {140, 210}};
		int[][] slotsB = {};
		int dur = 8;
		int[] expectedOutput  = null;
		Assert.assertArrayEquals(expectedOutput, TimePlanner.meetingPlanner(slotsA, slotsB, dur));
	}
	
	@Test
	public void testEasyExample() {
		int[][] slotsA = {{10, 50}, {60, 120}, {140, 210}};
		int[][] slotsB = {{10,20}, {60, 70}};
		int dur = 8;
		int[] expectedOutput  = {10, 18};
		Assert.assertArrayEquals(expectedOutput, TimePlanner.meetingPlanner(slotsA, slotsB, dur));
	}
	
	@Test
	public void testStandardExample() {
		int[][] slotsA = {{10, 50}, {60, 120}, {140, 210}};
		int[][] slotsB = {{0,15}, {60, 70}};
		int dur = 8;
		int[] expectedOutput  = {60, 68};
		Assert.assertArrayEquals(expectedOutput, TimePlanner.meetingPlanner(slotsA, slotsB, dur));
	}
	
	@Test
	public void testLongExample() {
		int[][] slotsA = {{0, 50}, {60, 120}, {140, 210}};
		int[][] slotsB = {{0,15}, {16, 70}};
		int dur = 20;
		//TODO Can you make it output {0,20}
		int[] expectedOutput  = {16, 36};
		Assert.assertArrayEquals(expectedOutput, TimePlanner.meetingPlanner(slotsA, slotsB, dur));
	}
}
