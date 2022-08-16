package com.sample.operation.main;
import com.sample.operation.add.Addition;
import com.sample.operation.sub.Substraction;
import com.sample.operation.mul.Multiplication;
import com.sample.operation.div.Division;
import com.sample.operation.mod.Modulus;
import com.sample.operation.areaSq.AreaOfSquare;
import com.sample.operation.areaRec.AreaOfRectangle;
import com.sample.operation.areaTri.AreaOfTriangle;
import com.sample.operation.volSq.VolumeOfSquare;
import com.sample.operation.volRec.VolumeOfRectangle;

public class BasicOperations 
{
	public static void main(String[] args) 
	{
		Addition a = new Addition();	// calling the addition method
		System.out.println("Addition = "+a.add());
		
		Substraction s = new Substraction();	// calling the subtraction method
		System.out.println("Substraction = "+ s.sub());
		
		Multiplication m = new Multiplication ();	 // calling the multiplication method
		System.out.println("Multiplication = "+m.mul());
		
		Division d = new Division ();	// calling the division method
		System.out.println("Quotient value = "+d.div());
		
		Modulus mm = new Modulus();		// calling the modulus method
		System.out.println("Remainder value = "+ mm.mod());
		
		AreaOfSquare aS = new AreaOfSquare();	 // calling the areaOfSquare method
		System.out.println("Area of Square is "+aS.areaSq());
		
		AreaOfRectangle aR = new AreaOfRectangle();		// calling the areaOfRectangle method
		System.out.println("Area of Rectangle is "+aR.areaRec());
		
		AreaOfTriangle aT = new AreaOfTriangle();	// calling the areaOftriangle method
		System.out.println("Area of triangle is "+aT.areatri());
		
		VolumeOfSquare vS = new VolumeOfSquare();	// calling the volumeOfSquare method
		System.out.println("Volume of Square is "+ vS.volSq());
		
		VolumeOfRectangle vR= new VolumeOfRectangle();	// calling the volumeOfRectangle method
		System.out.println("Volume of Rectangle is "+ vR.volRec());
				
	}

}
