Topics:-
	1.Comments
	2.Hello World Print
	3.Variables
	4.Data types
	5.Strings
	6.Arrays
	7.Casting
	8.Constants
	9.Operators(Artihmetic and Assignment)
	10.Math class
        11.Taking Input
	12.Comparison Operators
	13.Conditional Statments(if-else)
	14.Logical Operators
        15.Conditional Statments(Switch)
        16.Loops
	17.Break and Continue
	18.Exception handling(try-catch)
	19.Functions/Methods
	20.Mini Project

/first program 
public class main
{
  public static void main(String[] args)
  {
     System.out.println("Hello World");
  }
}


//2 
public class Main
{
   public static void main(String[] args)
   {
      String name="Diganta";
      int age=22
      String neighbour="Monotosh";
      String friend= neighbour;
     System.out.println("The name is= "+name);
      System.out.println("The age "+age);
      System.out.println("The friend is="+ friend);
   }
}

Bytes requires to all data types:
byte-1
short-2
int- 4
long -8
float -4
double-8
char -2
boolean- 1

//3 
String is non-primitive data type
public class Length
{
  public static void main(String[] args)
  {
	  String name="Diganta";
	  System.out.println(name.length());
  }
}

//4 

Concatenate the String

public class FirstProgram 
{
  public static void main(String[] args)
  {
	  String name1="Aman";
	  String name2="Diganta";
	  String name3= name1 +" and "+ name2 ;
	  System.out.print(name3);
  }
}


5))charAt String method using

public class FirstProgram 
{
  public static void main(String[] args)
  {
	  String name1="Aman";
	  System.out.println(name1.charAt(2));
  }
}

 
 6))Replace method using in String

public class FirstProgram 
{
  public static void main(String[] args)
  {
	  String name1="Aman";
	  String finalname=name1.replace('a', 'o');
	  System.out.println(finalname);
  }
}


7))Substring method using in String

public class FirstProgram 
{
  public static void main(String[] args)
  {
	  String name1="Diganta";
	 String Finalname=name1.substring(0,4);
	 System.out.println(Finalname);
  }
}


8))Array
//Array is also non-primitive data types
public class FirstProgram 
{
  public static void main(String[] args)
  {
	int[] marks=new int[3];
	marks[0]=97;
	marks[1]=78;
	marks[2]=91;
	System.out.println(marks[2]);
  }
}


9))
public class FirstProgram 
{
  public static void main(String[] args)
  {
	boolean[] marks=new boolean[3];
	System.out.println(marks[2]);
    
  }
}


10))Length of the Array find:
public class FirstProgram 
{
  public static void main(String[] args)
  {
	int[] marks=new int[3];
	marks[0]=97;
	marks[1]=78;
	marks[2]=91;
	System.out.println(marks.length);
  }
}


11))2d array and 1d array

import java.util.Arrays;
//Array is also non-primitive data types
public class FirstProgram 
{
  public static void main(String[] args)
  {
	  int [] marks= {97,98,95};  //1d array
	  
	  int[][] finalmarks= {{97,98,90} , {100,67,79}}; //2d array
	  
	  System.out.println(finalmarks[0][1]); 
  }
}


11))Sort function using in Java

import java.util.Arrays;
//Array is also non-primitive data types
public class FirstProgram 
{
  public static void main(String[] args)
  {
	int[] marks=new int[3];
	marks[0]=97;
	marks[1]=78;
	marks[2]=91;
	System.out.println(marks[0]);
	Arrays.sort(marks);
	System.out.println(marks[0]);
	System.out.println(marks[1]);
    
  }
}


12))//Casting
public class FirstProgram 
{
  public static void main(String[] args)
  {
	 int price=100;
	 int finalprice= price+ (int)18.99;  //implicit casting
	 
	 System.out.println("The finalprice is= "+finalprice);
	 //Answer is 118
	  
  }
}


13)) //Constant

public class FirstProgram 
{
  public static void main(String[] args)
  {
	final int age=30;   //This value doesn't change
	System.out.println(age);
	
  }
}


14))
//Math Function
//max
//min
//random
public class FirstProgram 
{
  public static void main(String[] args)
  {
	System.out.println(Math.max(5, 6));
	System.out.println(Math.min(5, 6));
	
	System.out.println(Math.random()); //all value form in Long type
	System.out.println((int)(Math.random()*100)); //
  }
}



15))How to take Input in java:-

import java.util.Scanner;
public class FirstProgram 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("The value is= ");
	int a=sc.nextInt();
	System.out.println("The final value is= "+a);
  }
} 

16))How to take String Input in Java:-

import java.util.Scanner;
public class FirstProgram 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("The value is= ");
	String a=sc.nextLine();
	System.out.println("The final value is= "+a);
  }
} 


17))
//Comparison Operators
//a==b
//a!=b
//a<b
//a>b
//a>=b
//a<=b
public class FirstProgram 
{
  public static void main(String[] args)
  {
	boolean isSunup=true;
	if(isSunup==true)
	 System.out.println("Day");
    
	else
      System.out.println("Night");
  }
} 


18))
	public class FirstProgram 
{
  public static void main(String[] args)
  {
	int age=30;
	if(age>18)
	  System.out.println("can vote");
	
	else
		System.out.println("can't vote");
  }
} 


