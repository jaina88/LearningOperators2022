package com.netflix.qa.operators;

public class Incremnetoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1; // post incremnet
		int b = a++;
		int c = b++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b+c);
		
		int d = -1;
		int e = d++;
		
		System.out.println(d);
		System.out.println(e);
		
		int j = 1;
		int k = ++j; // pre incremnt
		
		System.out.println(j);
		System.out.println(k);
		System.out.println(j+k);
		
		int m = -5;
		int n = ++m;
		
		System.out.println(m);
		System.out.println(n);
			
		
		
		
	}
	
	

}
