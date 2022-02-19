package com.programs;

import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		/*
		 * the three user inputs are a, b, c
		 * 
		 */
		System.out.println("Enter three values");
		double a = r.nextDouble();
		double b = r.nextDouble();
		double c = r.nextDouble();
		/*
		 * finding delta value
		 */
		double delta = b * b - 4 * a * c;
		/*
		 * checking roots by delta
		 */
		if (delta > 0) {
			double x1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
			System.out.println("The roots of x are " + x1 + " and " + x2);
		} else if (delta == 0) {
			double x1 = -b / (2 * a);
			System.out.println("The root is " + x1);
		} else {
			System.out.println("Roots are not real.");
		}
		r.close();
	}

}
