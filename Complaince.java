package codeCon;

//Problem        : A Compliance Problem
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
//Your submission should *ONLY* use the following class name
public class Complaince
 {
	static ArrayList<Integer> occ = new ArrayList();
	

static int fact(int n)
{
	if(n==0 || n == 1)
		return 1;
	
	return n * fact(n-1);
}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		for (int i = 0; i < 256; i++) {
			occ.add(i, 0);
		}
		String in = stdin.nextLine();

		for (int i = 0; i < in.length(); i++) {
			int ascii = (int) in.charAt(i);
				int num = occ.get(ascii);
				occ.remove(ascii);
				occ.add(ascii, ++num);
		}

		int no_odd = 0;
		ArrayList <Integer> evenNum = new ArrayList<Integer>();
		int hl = in.length()/2;
		
		for (int i = 0; i < occ.size(); i++) {
			int num = occ.get(i);
			if (num > 0) 
			{
				if (num % 2 != 0) 
				{
					evenNum.add(fact(num/2));
					no_odd++;
				}
				
				if(num%2 == 0)
				{
					evenNum.add(fact(num/2));
				}
			}
		}

		if (no_odd > 1)
			System.out.println(0);
		else
			{
				int fct = 1;
				for (int i = 0; i < evenNum.size(); i++) {
					fct = fct*evenNum.get(i);
				}
				System.out.println(fact(hl)/fct);
			}

	}

}
