package com.functionprogram;

import java.util.*;

public class SumofTriplet {

	static void Triplet(int n, int[] a) {
		int result = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					result += 1;
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements in an array ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Triplet(n, a);
		s.close();
	}

}
