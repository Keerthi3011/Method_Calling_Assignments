package com.domain;

//Requirement : Create a class named X, which perform 10 mathematical operations in different method. 
//Call the each and every method and perform mathematical operation in main method
public class X {
	
		// creating a method to perform addition
		void addition(int a, int b)
		{
			int c = a+b;
			System.out.println("Addition of "+ a+ " and "+b+" is "+c);
		}
		
		// creating a method to perform subtraction
		void subtraction(int a, int b)
		{
			int c = a-b;
			System.out.println("Substraction of "+ a+ " and "+b+" is "+c);
		}
		
		// creating a method to perform multiplication	
		void multiplication(int a, int b)
		{
			int c = a*b;
			System.out.println("Multiplication of "+ a+ " and "+b+" is "+c);
		}
		
		// creating a method to perform division
		void division(int a, int b)
		{
			int c = a/b;
			System.out.println("Quotient of "+ a+ " / "+b+" is "+c);
		}
		
		// creating a method to perform modulus
		void modulus(int a, int b)
		{
			int c = a%b;
			System.out.println("Remainder of "+ a+ " / "+b+" is "+c);
		}
		
		// creating a method to find Area Of Square
		void areaOfSquare(int a)
		{
			int op = a*a;
			System.out.println("Area of Square is "+ op);
		}
		
		// creating a method to find area Of Rectangle
		void areaOfRectangle(int l, int b)
		{
			int op = l*b;
			System.out.println("Area of Rectangle is "+ op);
		}
		
		// creating a method to find area Of triangle
		void areaOftriangle(int b, int h)
		{
			int op =(b*h)/2 ;
			System.out.println("Area of Triangle is "+ op);
		}
		
		// creating a method to find volume Of Square
		void volumeOfSquare(int a)
		{
			int op = a*a*a;
			System.out.println("Volume of Square is "+ op);
		}
		
		// creating a method to find volume Of Rectangle
		void volumeOfRectangle(int b, int h, int l)
		{
			int op = b*h*l;
			System.out.println("Volume of Rectangle is "+ op);
		}
		
		// creating a main method to call all the methods 
		public static void main(String[] args) 
		{
			X x = new X(); // creating object for the class X
			
			x.addition(10, 20); // calling the addition method
			x.subtraction(50, 10);  // calling the subtraction method
			x.multiplication(17, 15);  // calling the multiplication method
			x.division(80,12);  // calling the division method
			x.modulus(80, 12);  // calling the modulus method
			x.areaOfSquare(5);  // calling the areaOfSquare method
			x.areaOfRectangle(6, 13);   // calling the areaOfRectangle method
			x.areaOftriangle(8, 7);  // calling the areaOftriangle method
			x.volumeOfSquare(6);   // calling the volumeOfSquare method
			x.volumeOfRectangle(5,8,3);   // calling the volumeOfRectangle method
		}

}
