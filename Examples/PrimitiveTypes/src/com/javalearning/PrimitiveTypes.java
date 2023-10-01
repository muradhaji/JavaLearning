package com.javalearning;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		byte min_byte = Byte.MIN_VALUE;
		byte max_byte = Byte.MAX_VALUE;
		System.out.println("Min byte: " + min_byte);
		System.out.println("Max byte: " + max_byte);
		
		short min_short = Short.MIN_VALUE;
		short max_short = Short.MAX_VALUE;
		System.out.println("Min short: " + min_short);
		System.out.println("Max short: " + max_short);
		
		int min_int = Integer.MIN_VALUE;
		int max_int = Integer.MAX_VALUE;
		System.out.println("Min int: " + min_int);
		System.out.println("Max int: " + max_int);
		
		long min_long = Long.MIN_VALUE;
		long max_long = Long.MAX_VALUE;
//		long max_long = 9223372036854775807L;
		System.out.println("Min long: " + min_long);
		System.out.println("Max long: " + max_long);
		
		float min_float = Float.MIN_VALUE;
		float max_float = Float.MAX_VALUE;
//		float max_float = 4.2F;
		System.out.println("Min float: " + min_float);
		System.out.println("Max float: " + max_float);
		
		double min_double = Double.MIN_VALUE;
		double max_double = Double.MAX_VALUE;
//		double max_double = 4.2D;
		System.out.println("Min double: " + min_double);
		System.out.println("Max double: " + max_double);
		
		boolean f_boolean = Boolean.FALSE;
		boolean t_boolean = Boolean.TRUE;
//		boolean t_boolean = true;
		System.out.println("False boolean: " + f_boolean);
		System.out.println("True boolean: " + t_boolean);
		
		int min_character = Character.MIN_VALUE;
		int max_character = Character.MAX_VALUE;
		char character = 'A';
		System.out.println("Min char: " + min_character);
		System.out.println("Max char: " + max_character);
		System.out.println("Character: " + character);
		
		var variable = true;
		variable = false;
		System.out.println("Variable: " + variable);
	}

}
