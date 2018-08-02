import java.util.*;
import java.lang.*;
import java.io.*;
class largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1 = 1, num2 = 2, num3 = 3;

      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
	}
}
