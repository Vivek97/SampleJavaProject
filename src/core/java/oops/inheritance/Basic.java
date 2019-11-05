package core.java.oops.inheritance;



class A
{
	A()
	{
		common =1;
		 System.out.println("A ---------------");
	}
    int i,common;
    void methodOne()
    {
        System.out.println("A- From methodOne");
    }
    
    void common()
    {
        System.out.println("A -From Common");
    }
}
 
class B extends A
{
	
	B()
	{
		 System.out.println("B ---------------");
	}
	
    int j,common;
    void methodTwo()
    {
    	common =2;
        System.out.println("B -From methodTwo");
    }
    
    void common()
    {
        System.out.println("B -From Common");
    }
}

public class Basic {
	

    public static void main(String[] args)
    {
    	System.out.println("  B b = new B();");
        B b = new B();
        System.out.println("    b.methodOne();");
        b.methodOne();
        System.out.println("     b.methodTwo();");
        b.methodTwo();
        System.out.println("     b.common();");
        b.common();
    System.out.println(" b.j   "+b.j);
    System.out.println(" b.i   "+b.i);
    System.out.println(" b.j   "+b.common);
    
    System.out.println("-------------------------------------------------------------------    ");
    System.out.println("  A a = new A();");
    A a= new A();
    System.out.println("    ab.methodOne();"); 
  a.methodOne();
  System.out.println("     a.common();");
  a.common();
  System.out.println("    a.i  "+a.i);
  System.out.println(" a.common   "+a.common);
  
  //Not Accessible
  //a.methodTwo();
  //  System.out.println("    i  "+a.j);
    
    System.out.println("-------------------------------------------------------------------    ");
    System.out.println("  A ab = new B();");
    A ab= new B();
    System.out.println("    ab.methodOne();"); 
  ab.methodOne();
  System.out.println("     ab.common();");
  ab.common();
  System.out.println("    ab.i  "+ab.i);
  System.out.println(" ab.common   "+ab.common);
  
  //Not Accessible
   //a.methodTwo();
  //  System.out.println("    i  "+a.j);
  
  System.out.println("-------------------------------------------------------------------    ");
  System.out.println("  B ba= (B) new A();");

  //illegal cast exception
//  B ba= (B) new A();

 
    }
    

}

