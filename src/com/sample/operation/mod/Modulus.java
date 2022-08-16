package com.sample.operation.mod;

import com.variables.Variables;

public class Modulus 
{
	public int mod()
	{
		Variables v = new Variables();
		v.setA(12);
		v.setB(7);
		
		return (v.getA()%v.getB());
	}
}
