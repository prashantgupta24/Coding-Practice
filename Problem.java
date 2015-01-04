package codeCon;

//Problem        : A Compliance Problem
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
//Your submission should *ONLY* use the following class name
public class Problem
{
  static ArrayList<Integer> occ = new ArrayList();
  static boolean value = true;
  public static void main(String[] args)
  {

     Scanner stdin = new Scanner(System.in);
     for(int i=0;i<256;i++)
      occ.add(i,0);
     while(stdin.hasNextLine()) 
     {
         //System.out.println(stdin.nextLine());
         String in = stdin.nextLine();
         
         for(int i=0;i<in.length();i++)
         {
             int ascii = (int)in.charAt(i);
             if(occ.get(ascii) == 0)
              occ.add(ascii,1);
              else
              {
                  int num = occ.get(ascii);
                  occ.remove(ascii);
                  occ.add(ascii,++num);
              }
         }
     }
     
     stdin.close();
     
     int no=0;
     for(int i=0;i<occ.size();i++)
     {
         int num = occ.get(i);
         if(num>0)
         System.out.println(num);
         if(num%2 !=0)
         {
             no++;
             if(no>1)
             value = false;
         }
     }
     if(value)
      System.out.println("yes");
      else
      System.out.println("no");
  }

}
