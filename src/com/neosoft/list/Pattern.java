package com.neosoft.list;

public class Pattern {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
