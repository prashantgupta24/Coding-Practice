package codeCon;

//Problem        : Messed up Rugby
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.ArrayList;
import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Rugby
{
  static  int nums[] = {2,3,7};
  static ArrayList a = new ArrayList();
  public static void main(String[] args)
  {

     Scanner stdin = new Scanner(System.in);
 
     while(stdin.hasNextLine()) 
     {
         //System.out.println(stdin.nextLine());
    	 int number = Integer.parseInt(stdin.nextLine());
    	 System.out.println(func(number, nums.length, a));
    	 //func(number, 3);
     }
     stdin.close();
  }
  
  public static int func(int value, int numLeft, ArrayList a)
 {
		if (value < 0)
			return 0;
		
		if(numLeft ==0 )
			return 0;

		if (value == 0)
		{
			for (int i = 0; i < a.size(); i++) {
				//System.out.println(a.get(i));
			}
			
			return 1;
		}

		// System.out.println("Here : "+func(value, numLeft - 1));
		int first = func(value, numLeft - 1, a);
		int sec = func(value - nums[numLeft - 1], numLeft, a);
		a.add(nums[numLeft - 1]);
		//System.out.println(first + " : " + sec);
		return first + sec;

	}

}
