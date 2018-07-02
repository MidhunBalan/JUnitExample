package com.junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringTestCases {
	
	@Before
	public void before(){
//		This will run before each of the test cases
		System.out.println("Before");
	}
	
	@After
	public void after(){
//		This will run after each of the test cases
		System.out.println("After");
	}
	@BeforeClass
	public static void beforeClass(){
//		This will run before each of the test cases
		System.out.println("BeforeClass");
	}
	@AfterClass
	public static void afterClass(){
//		This will run before each of the test cases
		System.out.println("AfterClass");
	}

	@Test
	public void testCompareString() {
		StringFunctions stringfunctions= new StringFunctions();
		assertFalse(stringfunctions.compareString("midhunnnn", "midhun"));
		
	}
	
	@Test
	public void testConcatinateString() {
		StringFunctions stringfunctions= new StringFunctions();
		assertEquals("HelloWorld",stringfunctions.concatinateString("Hello", "World"));
		
	}
	
//	@Test
//	public void testSampleArray() {
//		StringFunctions stringfunctions= new StringFunctions();
//		int expectedArray[] = new int[]{3, 8};
//		assertArrayEquals(expectedArray, stringfunctions.sampleArray(new int[]{2, 7}));
//		
//		
//	}
//	@Test(timeout = 10)
//	public void testPerformance() {
//		StringFunctions stringfunctions= new StringFunctions();
//		stringfunctions.performance();
//	}
	
//	@Test(expected = ArithmeticException.class)
//	public void testException() {
//		StringFunctions stringfunctions= new StringFunctions();
//		stringfunctions.exception(0);
//	}

}
