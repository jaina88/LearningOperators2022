package com.netflix.qa.operators;

public class decrementopeerators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int a = 2;
	int b = a--; // post decrement
	
	System.out.println(a);
	System.out.println(b);

	
	int x = 2;
	int y = --x; // pre decrement
	
	System.out.println(x);
	System.out.println(y);
	
	int t = -99;
	int u = --t;
	
	System.out.println(t);
	System.out.println(u);
	}

}
