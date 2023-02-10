package com.bridgelabz.mood_analyser;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMoodAnalyzer {

	@Test
	public void testMessageContainSad() throws MoodAnalyzerException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in sad mood");
		String SadMood = moodAnalyser.analyseMood();
		System.out.println(SadMood);
		assertEquals("SAD" , SadMood);
	}
	
	@Test
	public void testMessageContainHappy() throws MoodAnalyzerException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in happy mood");
		String HappyMood = moodAnalyser.analyseMood();
		System.out.println(HappyMood);
		assertEquals("HAPPY" , HappyMood);
	}
}
