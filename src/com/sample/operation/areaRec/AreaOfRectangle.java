package com.sample.operation.areaRec;
//import com.sample.operation.mul.Multiplication;

import com.sample.variables.Variables;

public class AreaOfRectangle 
{
	public int areaRec()
	{
		Variables v = new Variables();
		v.setA(23);
		v.setB(15);
		
		return (v.getA()*v.getB());
	}
}
