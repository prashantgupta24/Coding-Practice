package codeCon;

//Problem        : Messed up Rugby
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
//Your submission should *ONLY* use the following class name
public class Rugby2
{
	 static int arr[] = {2,3,7};
	 static TreeSet<String> ts = new TreeSet();
	 //static ArrayList<String> op = new ArrayList();
	 
    public static void main(String[] args)
    {

       Scanner stdin = new Scanner(System.in);
       while(stdin.hasNextLine()) 
       {
           //System.out.println(stdin.nextLine());
    	   int num = Integer.parseInt(stdin.nextLine());
    	   
    	  
    	   
    	   ArrayList<Integer> ans = new ArrayList();
    	   
    	   func(num, ans);
    	   
    	   String s;
    	   do {
    		   
    		   s = ts.pollFirst();
    		   if(s == null)
    			   break;
			System.out.println(s);
    		   
		} while(true);
       }
       stdin.close();
    }
    
    static void func(int num, ArrayList<Integer> ans)
    {
    	if(num == 0)
    	{
    		//store(ans);
    		System.out.println(ans.get(0));
    		return;
    	}
    	
    	if(num < 0)
    	{
    		return;
    	}
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		int e = arr[i];
			ans.add(e);
    		func(num-e, ans);
    		ans.remove(ans.size()-1);
    	}
    }

	private static void store(ArrayList<Integer> ans) {
		
		int tw = 0, th = 0, sv = 0;
		for (int i = 0; i < ans.size(); i++) {
			int n = ans.get(i);
			switch(n)
			{
			case 2 : tw++;
			break;
			case 3 : th++;
			break;
			case 7 : sv++;
			break;
			}
		}
		String s = sv+" "+th+" "+tw;
			ts.add(s);
	}

}
