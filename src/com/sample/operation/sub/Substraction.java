package com.sample.operation.sub;

import com.sample.variables.Variables;

public class Substraction 
{
	public int sub()
	{
		//int c = a-b;
		//System.out.println("Substraction of "+ a+ " and "+b+" is "+c);
		Variables v = new Variables();
		v.setA(20);
		v.setB(15);
		
		return (v.getA()-v.getB());
	}
}
