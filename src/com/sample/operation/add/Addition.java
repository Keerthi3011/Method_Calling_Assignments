package com.sample.operation.add;
import com.variables.Variables;

public class Addition 
{
	public int add()
	{
		//int c = a+b;
		//System.out.println("Addition of "+ a+ " and "+b+" is "+c);
		Variables v = new Variables();
		v.setA(20);
		v.setB(25);
		
		return (v.getA()+v.getB());
	}
}
