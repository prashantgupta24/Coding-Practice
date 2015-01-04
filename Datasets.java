package codeCon;

//Problem        : Matching Datasets
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
//Your submission should *ONLY* use the following class name
public class Datasets
{
	
	static ArrayList<String> orgDS = new ArrayList();
	static ArrayList<String> newDS = new ArrayList();
	static int num = 5;
	
  public static void main(String[] args)
  {

  /*   Scanner stdin = new Scanner(System.in);
     //while(stdin.hasNextLine()) 
     {
         //System.out.println(stdin.nextLine());
    	 //num = Integer.parseInt(stdin.nextLine());
    	 num = 3;
    	 
    	 for (int i = 0; i < num; i++) {
			orgDS.add(stdin.nextLine());
		}
    	 for (int i = 0; i < num; i++) {
 			newDS.add(stdin.nextLine());
 		}
    	 
     }*/
    // stdin.close();
	  
	  orgDS.add("288.70,7.62,22,19");
	  orgDS.add("770.15,78.71,20,89");
	  orgDS.add("977.11,10.75,19,22");
	  orgDS.add("900.54,89.79,28,19");
	  orgDS.add("256.83,14.76,44,82");
     
	  newDS.add("256.83,14.66,44,82");
	  newDS.add("900.54,89.77,28,19");
	  newDS.add("770.15,78.71,20,88");
	  newDS.add("288.71,7.62,22,19");
	  newDS.add("977.10,10.74,19,22");

	  TreeMap<Double, Integer> tm  = new TreeMap();
	  
     for(int i=0;i<num;i++)
     {
    	 tm  = new TreeMap();
    	 
    	 for(int j=0;j<num;j++)
    	 {
    		 double value = getValue(orgDS.get(i), newDS.get(j));
    		 tm.put(value, j);
    		/* if(comp(orgDS.get(i), newDS.get(j)))
    		 {
    			 System.out.println(i+","+j);
    		 }*/
    	 }
    	 System.out.println(i+","+tm.get(tm.firstKey()));
     }
  }


private static double getValue(String s1, String s2) {
	
	String sp1[] = s1.split(",");
	String sp2[] = s2.split(",");
	
	ArrayList<Boolean> vote = new ArrayList<Boolean>();
	double ans = 0;
	
	for (int i = 0; i < sp1.length; i++) {
		
		double num1 = Double.parseDouble(sp1[i]);
		double num2 = Double.parseDouble(sp2[i]);
		
		ans = ans + Math.abs(num1-num2);
	}
	
	return ans;
}
/*
private static boolean comp(String s1, String s2) {
	
	String sp1[] = s1.split(",");
	String sp2[] = s2.split(",");
	
	ArrayList<Boolean> vote = new ArrayList<Boolean>();
	
	for (int i = 0; i < sp1.length; i++) {
		
		double num1 = Double.parseDouble(sp1[i]);
		double num2 = Double.parseDouble(sp2[i]);
		
		if((num1 == num2) || Math.abs(num1-num2) <= 1)
		{
			vote.add(true);
		}
		else
			vote.add(false);
		
	}
	
	int trueVotes = 0;
	for (int i = 0; i < vote.size(); i++) {
		if(vote.get(i))
			trueVotes++;
	}
	if(trueVotes>=(sp1.length/2))
		return true;
	else
		return false;
}*/

}
