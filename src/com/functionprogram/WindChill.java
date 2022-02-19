package com.functionprogram;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		/*
		 * Entering the user inputs
		 * 
		 */
		System.out.println("Enter values");
		double t = w.nextDouble();
		double v = w.nextDouble();
		/*
		 * calculating wind chill temperature
		 */
		if(t > 50 || v < 3 || v > 120) {
			System.out.println("It is Invalid");
		}
			else {


				double windchill = 35.74 + 0.6215 * t +
						(0.4275 * t - 35.75) * Math.pow(v, 0.16);
				System.out.println("The status of wind "+windchill);
			}
       w.close();
	}

}
