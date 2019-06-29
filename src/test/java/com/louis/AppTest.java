package com.louis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	App app = new App();

	@Test(expected = ArrayTooShortException.class)
	public void testIntTooShort() throws ArrayTooShortException {
		int[] shortIntArray = { 1, 2 };
		double result = app.calculateProductResult(shortIntArray);
	}

	@Test
	public void testInt() throws ArrayTooShortException {
		int[] shortIntArray = { 5, 4, 6, 1 };
		double result = app.calculateProductResult(shortIntArray);
		double expected = 8.77;
		assertEquals(expected, result, 0.01);

	}

	@Test(expected = ArrayTooShortException.class)
	public void testShortTooShort() throws ArrayTooShortException {
		short[] shortIntArray = { 1, 2 };
		double result = app.calculateProductResult(shortIntArray);

	}

	@Test
	public void testShort() throws ArrayTooShortException {
		short[] shortIntArray = { 5, 4, 6, 1 };
		double result = app.calculateProductResult(shortIntArray);
		double expected = 8.77;
		assertEquals(expected, result, 0.01);
	}

	@Test(expected = ArrayTooShortException.class)
	public void testDoubleTooShort() throws ArrayTooShortException {
		double[] doubleArray = { 12.4, 34.2 };
		double result = app.calculateProductResult(doubleArray);
	}

	@Test
	public void testDouble() throws ArrayTooShortException {
		double[] doubleArray = { 12.4, 34.2, 45.7, 567.23, 56.76 };
		double expected = 571.89;
		double result = app.calculateProductResult(doubleArray);
		assertEquals(expected, result, 0.01);
	}

	@Test(expected = ArrayTooShortException.class)
	public void testLongTooShort() throws ArrayTooShortException {
		long[] doubleArray = { 124L, 342L };
		double result = app.calculateProductResult(doubleArray);
	}

	@Test
	public void testLong() throws ArrayTooShortException {
		long[] shortIntArray = { 5L, 4L, 6L, 1L };
		double result = app.calculateProductResult(shortIntArray);
		double expected = 8.77;
		assertEquals(expected, result, 0.01);
	}

	@Test(expected = ArrayTooShortException.class)
	public void testFloatTooShort() throws ArrayTooShortException {
		float[] doubleArray = { 12.4f, 34.2f };
		double result = app.calculateProductResult(doubleArray);
	}

	@Test
	public void testFloat() throws ArrayTooShortException {
		float[] doubleArray = { 12.4f, 34.2f, 45.7f, 567.23f, 56.76f };
		double expected = 571.89;
		double result = app.calculateProductResult(doubleArray);
		assertEquals(expected, result, 0.01);
	}

}
