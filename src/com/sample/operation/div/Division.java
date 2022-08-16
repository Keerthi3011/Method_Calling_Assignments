package com.sample.operation.div;

import com.sample.variables.Variables;

public class Division 
{
	public int div()
	{
		Variables v = new Variables();
		v.setA(20);
		v.setB(5);
		
		return (v.getA()/v.getB());
	}
}
