package org.amalitech.classcode_11122019;

public class ClassCode_11122019 {
  
	public static void main (String [] args) {
	
      //1. declaring an integer
	  int x;
	  x = 2;
	  
	  int y;
	  y = 7;
	  
	  System.out.println(x);
	  
	  System.out.println(x + y);
	  
	  //Addition
	  
	  String pre_stmnt = "x + y = ";
	  
	  System.out.println( "x + y = " + x + y);
	  
	  System.out.println( "x + y = " + (x + y)); 
	  
	  //Multiplication
	  String pre_stmnt_multiply = "x * y = ";
	  
	  System.out.println(pre_stmnt_multiply + (x * y));
	  
	  //Division
	  String pre_stmnt_division = "x / y = ";
	  
	  System.out.println(pre_stmnt_division + (x / y));
	  
	  
	  //Concatenation
	  
	  //Casting
	  double x_d =(double) x;
	  double y_d =(double) y;
	  
	  System.out.println("x_d / y_d =" + (x_d/y_d));
	  
	  //using float(s)
	  float x_f = (float)x;
	  float y_f = (float)y;
	  
	  System.out.println("x_f / y_f =" + (x_f/y_f));
	  
	  int a = ++x;
	  System.out.println("a : "+ a);
	  
	  int b = x++;
	  System.out.println("b : "+ b);
	  
	 
}

}
