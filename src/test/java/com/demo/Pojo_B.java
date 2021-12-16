package com.demo;

public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A ref = new Pojo_A();
		
		int a1 = ref.getAge();
		
		System.out.println("Age " +a1);
		
		ref.setAge(15);
		
		int a2 = ref.getAge();
		
		System.out.println("Age " + a2);
	}

}
