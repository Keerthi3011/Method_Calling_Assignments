package com.sample.operation.mul;

import com.variables.Variables;

public class Multiplication 
{
	public int mul()
	{
		Variables v = new Variables();
		v.setA(2);
		v.setB(5);
		
		return (v.getA()*v.getB());
	}
}
