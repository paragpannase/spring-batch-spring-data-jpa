package com.hovs.demo;

import java.util.Arrays;

/*public class StringTest {

	public static void main(String[] args) {
		
		Benefit benefit= Benefit.getBenefit();
		System.err.println(benefit);
		
		System.err.println(Benefit.getBenefit());
		try {
			System.err.println(benefit.clone());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class Benefit implements Cloneable {

	private static Benefit benefit;

	private Benefit() {

	}

	public static Benefit getBenefit() {
		if (benefit == null) {
			benefit = new Benefit();
			return benefit;
		} else {
			return benefit;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return benefit;
	}
}
*/

public class StringTest {

	public static void main(String[] args) {

		String[] s = new String[100];
		
		s[1]="hello";
		s[2]="hi";
		
		
		
		

		// s.toCharArray();

	/*	char str[] = new char[100];

		for (int i = 0; i <= s.length()-1; i++) {
			str[i] = s.charAt(i);
		}*/
		
	//	System.err.println(str);
		

	}

}

/*
 * final class Employee { final String pancardNumber;
 * 
 * public Employee(String pancardNumber) { this.pancardNumber = pancardNumber; }
 * 
 * public String getPancardNumber() { return pancardNumber; }
 * 
 * }
 */