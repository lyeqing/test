package com.louis;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Yeqing Liu (Louis)
public class App {
	public double calculateProductResult(double[] myNumericInput) throws ArrayTooShortException {
		if (myNumericInput.length < 3) {
			throw new ArrayTooShortException();
		}

		return calculate(myNumericInput);
	}

	private double calculate(double[] myNumericInput) {
		Arrays.sort(myNumericInput);
		int arrayLength = myNumericInput.length;
		List<Double> doubleList = new ArrayList<Double>();
		for (int i = 0; i < 3; i++) {
			doubleList.add(myNumericInput[arrayLength - i - 1]);
		}

		double sum = doubleList.stream().mapToDouble(x -> x * x).sum();
		double rawResult = Math.sqrt(sum);
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(rawResult));
	}

	public double calculateProductResult(int[] myNumericInput) throws ArrayTooShortException {
		if (myNumericInput.length < 3) {
			throw new ArrayTooShortException();
		}
		double[] doubles = Arrays.stream(myNumericInput).asDoubleStream().toArray();
		return calculate(doubles);
	}

	public double calculateProductResult(long[] myNumericInput) throws ArrayTooShortException {
		if (myNumericInput.length < 3) {
			throw new ArrayTooShortException();
		}
		double[] doubles = Arrays.stream(myNumericInput).asDoubleStream().toArray();
		return calculate(doubles);
	}

	public double calculateProductResult(float[] myNumericInput) throws ArrayTooShortException {
		if (myNumericInput.length < 3) {
			throw new ArrayTooShortException();
		}
		double[] doubles = new double[myNumericInput.length];
		for (int i = 0; i < myNumericInput.length; i++) {
			doubles[i] = myNumericInput[i];
		}

		return calculate(doubles);
	}

	public double calculateProductResult(short[] myNumericInput) throws ArrayTooShortException {
		if (myNumericInput.length < 3) {
			throw new ArrayTooShortException();
		}
		double[] doubles = new double[myNumericInput.length];
		for (int i = 0; i < myNumericInput.length; i++) {
			doubles[i] = myNumericInput[i];
		}
		return calculate(doubles);
	}

}