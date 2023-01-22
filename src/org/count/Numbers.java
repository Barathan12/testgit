package org.count;

import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of terms");
	int n = sc.nextInt();
	
	int count =0;
	for (int i = 1; i<=n; i++) {
		if (i%2==0) 
			count++;
			System.out.println("The total of all even numbers from 1 to "+n+"is:"+count);
		}
		
	}
}


