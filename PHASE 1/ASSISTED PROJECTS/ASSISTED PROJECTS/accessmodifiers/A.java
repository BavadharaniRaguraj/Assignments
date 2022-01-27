package accessmodifiers;

public class A {

	private int data=40; //private constructor  
	
	private void msg()
	{
		System.out.println("Hello");
    }  
	
	public void message()
	{
		System.out.println("Hello Public");
	}
	
	protected void display()
	{
		System.out.println("Hello Protected");
		}  
	
	public class Simple{  
		 public static void main(String args[]){  
		   A obj=new A();  
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();//Compile Time Error  
		   }  
		}  
	
}