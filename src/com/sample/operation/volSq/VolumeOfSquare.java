package com.sample.operation.volSq;

import com.variables.Variables;

public class VolumeOfSquare 
{
	public int volSq()
	{
		Variables v = new Variables();
		v.setA(12);
		return (v.getA()*v.getA()*v.getA());
	}
}
