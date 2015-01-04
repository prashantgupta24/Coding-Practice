package codeCon;

//Problem        : Base Arithmetic
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
//Your submission should *ONLY* use the following class name
public class BaseArith
{
	static HashMap<String, Integer> val = new HashMap();
	
	static int getMax(String s)
	{
		int max=0;
		for (int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			//System.out.println(c);
			int v = val.get(String.valueOf(c));
			if(v > max)
				max = v;
		}
		return max;
	}
	
	static double getDec(String s, int base)
	{
		double ans = 0;
		int length = s.length();
		for (int i = 0, b = length-1; i < length; i++, b--) {
			char c= s.charAt(i);
			int v = val.get(String.valueOf(c));
			ans = ans + (Math.pow(base, b))*v;
		}
		return ans;
	}
	
  public static void main(String[] args)
  {

     Scanner stdin = new Scanner(System.in);
     for(int i=0;i<10;i++)
    	 val.put(Integer.toString(i),i);
     val.put("A", 10);
     val.put("B", 11);
     val.put("C", 12);
     val.put("D", 13);
     val.put("E", 14);
     val.put("F", 15);
     while(stdin.hasNextLine()) 
     {
         //System.out.println(stdin.nextLine());
    	 
    	 String one = stdin.nextLine();
    	 String two = stdin.nextLine();
    	 
    	 int x = (int) (getDec(one, getMax(one)+1)+getDec(two, getMax(two)+1));
		System.out.println(x);
    	 //System.out.println(getDec(two, getMax(two)+1));
    	 
     }
     stdin.close();
  }

}

