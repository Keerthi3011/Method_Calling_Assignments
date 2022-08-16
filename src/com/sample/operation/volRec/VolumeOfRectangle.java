package com.sample.operation.volRec;

import com.sample.variables.Variables;

public class VolumeOfRectangle 
{
	public int volRec()
	{
		Variables v = new Variables();
		v.setA(9);
		v.setB(7);
		v.setC(6);
		return (v.getA()*v.getB()*v.getC());
	}
}
