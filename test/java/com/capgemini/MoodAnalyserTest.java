package com.capgemini;

import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.*;

public class MoodAnalyserTest {
    @Test 
	public void moodAnalysis() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad Message.");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
}