import java.util.*;

public class reads extends mainApp
{
//===========================================================================================================================================
private static  Scanner n = new Scanner(System.in); // numbers
private static  Scanner s = new Scanner(System.in); // Strings
private static  Scanner l = new Scanner(System.in);//lines
	
//===========================================================================================================================================
public static int readInt()
{
 int a; 
 while(true)
 {
 try {
 System.out.print("Insert Number: ");
 a=n.nextInt();
 n.reset();
 break;
 }
 catch(InputMismatchException e)
 {
 System.out.println("Bad Input Try Again!");
 n.next();
 continue;
 } 
 }
 return a;
}
//===========================================================================================================================================
public static long readLong()
{
 long a=-1; 
 while(true)
 {
 try {
 System.out.print("Insert Number: ");
 a=n.nextLong();
 n.reset();
 break;
 }
 catch(InputMismatchException exc)
 {
 System.out.println("Bad Input Try Again!");
 n.next();
 continue;
 }
 }
 return a;
}
//===========================================================================================================================================
public static double readDouble()
{	
 double a=-1; 
 while(true)
 {
 try {
 System.out.print("Insert Number: ");
 a=n.nextDouble();
 n.reset();
 break;
 }
 catch(InputMismatchException exc)
 {
 System.out.println("Bad Input Try Again!");
 n.next();
 continue;
 }
 }
 return a;
}
//===========================================================================================================================================
public static String readyn()
{ 
 String y=""; 
 boolean ok=false;
 while(true)
 {
 try {
	 while(ok==false)
	 {
       System.out.print("Insert (Yes/No): ");
       y=s.next();
      if(!y.equalsIgnoreCase("yes")&&!y.equalsIgnoreCase("no")&&!y.equalsIgnoreCase("y")&&!y.equalsIgnoreCase("n"))
      {
	    System.out.println("Please Insert Yes Or No.");
      }
       else
      {
		 if(y.equalsIgnoreCase("y"))
			 y="yes";
		 if(y.equalsIgnoreCase("n"))
			 y="no";
	   ok=true;
      }
	 }
	 s.reset();
 break;
 }
 catch(InputMismatchException exc)
 {
  System.out.println("Bad Input Try Again!");
  s.next();
 continue;
 }
 }
 return y;
}//===========================================================================================================================================
public static String readString()
{
 String st; 
 while(true)
 {
 try {
 System.out.print("Insert String: ");
 st=s.next();
 s.reset();
 break;
 }
 catch(InputMismatchException exc)
 {
  System.out.println("Bad Input Try Again!");
 s.next();
 continue;
 }
 }
 return st;
 

}
//===========================================================================================================================================
public static String readLine()
{
 String li=""; 
 while(true)
 {
 try {
 System.out.print("Insert String: ");
 li=l.nextLine();
 l.reset();
 break;
 }
 catch(InputMismatchException exc)
 {
  System.out.println("Bad Input Try Again!");
 l.next();
 continue;
 }
 }
 return li;

}
//===========================================================================================================================================
public static boolean readBoolean()
{
 boolean a=false; 
 while(true)
 {
 try {
 System.out.print("Insert (True/False): ");
 a=s.nextBoolean();
 s.reset();
 break;
 }
 catch(InputMismatchException exc)
 {
 System.out.println("Bad Input Try Again!");
 s.next();
 continue;
 }
 }
 return a;
}

//===========================================================================================================================================

	
	
	
	
	
	
	
	
}
	
	