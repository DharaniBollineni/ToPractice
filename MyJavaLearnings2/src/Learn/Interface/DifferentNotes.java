package Learn.Interface;

//https://beginnersbook.com/2013/05/java-interface/

public class DifferentNotes {

}
//1. Variables declared in interface are public, static and final by default.
interface Try
{
   int a=10;
   public int a=10;
   public static final int a=10;
   final int a=10;
   static int a=0;
}
//Inside any implementation class, you cannot change the variables declared in interface because by default, they are public, static and final. Here we are implementing the interface “Try” which has a variable x. When we tried to set the value for variable x we got compilation error as the variable x is public static final by default and final variables can not be re-initialized.


class Sample implements Try
{
  public static void main(String args[])
  {
     x=20; //compile time error
  }
}

//9) Interface variables must be initialized at the time of declaration otherwise compiler will throw an error.

interface Try
{
      int x;//Compile-time error
}


12) A class can implement any number of interfaces.

13) If there are two or more same methods in two interfaces and a class implements both interfaces, implementation of the method once is enough.

interface A
{
   public void aaa();
}
interface B
{
   public void aaa();
}
class Central implements A,B
{
   public void aaa()
   {
        //Any Code here
   }
   public static void main(String args[])
   {
        //Statements
    }
}
14) A class cannot implement two interfaces that have methods with same name but different return type.

interface A
{
   public void aaa();
}
interface B
{
   public int aaa();
}

class Central implements A,B
{

   public void aaa() // error
   {
   }
   public int aaa() // error
   {
   }
   public static void main(String args[])
   {

   }
}
15) Variable names conflicts can be resolved by interface name.

interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
class Hello implements A,B
{
    public static void Main(String args[])
    {
       /* reference to x is ambiguous both variables are x
        * so we are using interface name to resolve the 
        * variable
        */
       System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
    }
}
