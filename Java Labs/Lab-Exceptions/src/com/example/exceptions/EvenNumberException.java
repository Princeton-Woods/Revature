package com.example.exceptions;

public class EvenNumberException extends Exception{
	@Override
	public String getMessage() {
		return "you cannot input an even number.";
	}
}
