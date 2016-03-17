package com;

public class Hello {
	public static void main(String names[]){
		if (names.length == 0){
			System.out.println("Please input your name");
		} else {
			System.out.println("Hello " + names[1]);
		}
		System.out.println("Ky");
		for(int i = 0; i<10; i++){
		System.out.println("Curent:" + i);
		}
		
	}
	
}