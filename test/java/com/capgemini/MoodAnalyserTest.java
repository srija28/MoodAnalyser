package com.capgemini;

import org.junit.Test;

import com.capgemini.MoodAnalyser;

import static org.junit.Assert.*;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void TestMoodAnalysis() {

		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("NULL", mood);
	
	}
}