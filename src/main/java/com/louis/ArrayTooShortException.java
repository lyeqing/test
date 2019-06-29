package com.louis;

public class ArrayTooShortException extends Exception{
	public ArrayTooShortException() {
		System.err.println("Please enter an array with at least three numbers");
	}

}
