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
}
