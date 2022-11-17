//first program 
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
