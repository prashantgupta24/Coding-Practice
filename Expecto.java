package codeCon;

//Problem        : Expecto Palindronum
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Expecto
{
	static boolean isPalin(String a)
	{
		StringBuilder rev = new StringBuilder(a);
		rev.reverse();
		
		return (a.equals(rev.toString()));
	}
	
    public static void main(String[] args)
 {

		Scanner stdin = new Scanner(System.in);
		String in = stdin.nextLine();

		int l = in.length();

		if(isPalin(in))
		{
			System.out.println(l);
			return;
		}
		
		int n=0;
		StringBuilder copy = new StringBuilder(in);
		
		while(!isPalin(copy.toString()))
		{
			copy = copy.deleteCharAt(copy.length()-1);
			n++;
		}
		
		System.out.println(copy.length()+2*n);
		
	/*	for (int i = n; i < l; i++) {
			
			
			char charAt = copy.charAt(i);
			in = charAt + in;
			
			if(isPalin(in))
			{
				System.out.println(in);
				System.out.println(in.length());
				return;
			}
		}*/

	}

}
