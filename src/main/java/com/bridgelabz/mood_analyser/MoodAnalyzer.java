package com.bridgelabz.mood_analyser;

public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyseMood()throws MoodAnalyzerException {
		try {
		if (message.toLowerCase().contains("sad"))
			return "SAD";
		else 
			return "HAPPY";
		}catch(NullPointerException e) {
			throw new MoodAnalyzerException("Invalid Mood");
		}
		}
}
