package accessmodifiers_default;

import accessmodifiers.*;

 public class B extends A
 {
	 
	  public static void main(String args[])
	  {  
		  /*A obj = new A();//Compile Time Error 
	  Compile Time Error 
	   obj.msg(); */
	   
	   B b=new B();
	   b.display();
	   
	   A object=new A();
	   object.message();
			   
	   
	  }  
	}  


