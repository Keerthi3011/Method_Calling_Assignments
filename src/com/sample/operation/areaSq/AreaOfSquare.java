package com.sample.operation.areaSq;

import com.sample.variables.Variables;

public class AreaOfSquare 
{
	public int areaSq()
	{
		
		Variables v = new Variables();
		v.setA(5);	
		return (v.getA()*v.getA());
	}
}
