package com.functionprogram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		/*
		 * Entering the user inputs
		 * 
		 */
		System.out.println("Enter values");
		double x = r.nextDouble();
		double y = r.nextDouble();
		/*
		 * calculating distance using user inputs
		 */
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		/*
		 * prints the Euclidean distance from the point
		 */
		System.out.println("The Euclidean distance from the points is " + distance);
		r.close();
	}

}
