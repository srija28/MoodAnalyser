package com.capgemini;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("Happy"))
				return "HAPPY";
			else
				return "SAD";
		} catch (NullPointerException e) {
			return null;

		}
	}
}
