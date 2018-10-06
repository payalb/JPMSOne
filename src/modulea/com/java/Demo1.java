package com.java;

public class Demo1 {

	static{
		System.out.println("static block called!");
	}
	
	{
		System.out.println("instance block called!");
	}
	
	public Demo1(){
		System.out.println("Constructor called!");
	}
	public static void main(String args[]) {
		System.out.println("Main called!");
	}
}
