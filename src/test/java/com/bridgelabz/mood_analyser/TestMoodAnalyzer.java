package com.bridgelabz.mood_analyser;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMoodAnalyzer {

	@Test
	public void testMessageContainsSad()  {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is a sad message");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
		assertEquals("SAD" , mood);
	}
	
	@Test
	public void testMessageContainsHappy()  {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is a happy message");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
		assertEquals("HAPPY" , mood);
	}
}