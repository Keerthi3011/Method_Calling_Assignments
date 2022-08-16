package com.sample.operation.areaTri;
//import com.sample.operation.mul.Multiplication;
//import com.sample.operation.div.Division;

import com.variables.Variables;

public class AreaOfTriangle 
{
	public int areatri()
	{
		
		Variables v = new Variables();
		v.setA(9);
		v.setB(15);
		
		return ((v.getA()*v.getB())/2);
	}
}
