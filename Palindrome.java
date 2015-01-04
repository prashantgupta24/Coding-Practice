package codeCon;

//Problem        : A Compliance Problem
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Palindrome
{
    static StringBuilder out = new StringBuilder();
    static boolean val[];
    static boolean finalVal = false;
    public static void main(String[] args)
    {

       Scanner stdin = new Scanner(System.in);
       while(stdin.hasNextLine()) 
       {
           //System.out.println(stdin.nextLine());
    	   finalVal = false;
           String s = stdin.nextLine();
           val = new boolean[s.length()];
           func(s);
           if(finalVal)
                 System.out.println("yes");
            else
                 System.out.println("no");
       }
       stdin.close();
    }
    
    static void func(String s)
    {
        if(out.length() == s.length())
        {
            StringBuilder rev = new StringBuilder(out);
            rev.reverse();
            if(out.toString().equals(rev.toString()))
                finalVal = true;
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            if(val[i])
             continue;
             val[i] = true;
             out.append(s.charAt(i));
             func(s);
             val[i] = false;
             out.setLength(out.length()-1);
        }
    }

}
