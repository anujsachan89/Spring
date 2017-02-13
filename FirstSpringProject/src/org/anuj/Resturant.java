package org.anuj;

import java.util.Scanner;



public class Resturant {
public void greetCustomer(){
	System.out.println("Welcome to our resturant");
}
public void welcomeCustomer(){
	System.out.println("Have a nice day");
}
public int additionOfNumbers(){
	System.out.println("Enter first number");
	Scanner sc = new Scanner(System.in);
	int number1 = sc.nextInt();
	System.out.println("Enter Second number");
	int number2 = sc.nextInt();
	int result;

	result = number1+number2;
	System.out.println("Result of two number is :"+result);
	return result;
}
}
