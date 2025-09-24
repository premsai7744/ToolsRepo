package com.premit.tutorial.maven_project_git;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestB {
	@Test
	public void testArithemticWithPositives() {
		B b = new B();
		int actualResult = b.arithmetic(50, 50);
		int expectedResult = 100;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testArithmeticWithNegatives() {
		B b = new B();
		int actualResult = b.arithmetic(-100, -100);
		int expectedResult = -200;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testArithemticWithMixed() {
		B b = new B();
		int actualResult = b.arithmetic(-100, 50);
		int expectedResult = -50;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testArithmeticWithCharacters() {
		
	}
	
}
