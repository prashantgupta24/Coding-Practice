package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	public static void main(String args[])
	{/*
		
Scanner in = new Scanner(System.in);
		List<Integer> l = new ArrayList();
		l.add(7);
		l.add(3);
		l.add(1);
		
		l = sort(8, l.subList(0, l.size()));
		for(int i=0;i<l.size();i++)
		System.out.print(l.get(i));
		
		//revString("hello");
StringBuilder s = new StringBuilder("abc");
StringBuilder s1 = new StringBuilder(s);
s1.reverse();
System.out.println(s);

	//System.out.println((int)'a');
//System.out.println(fact(0));
StringBuilder copy = new StringBuilder("hello");
copy = copy.deleteCharAt(copy.length()-1);
System.out.println(copy);

String[] input = new String[] {"(-9,-2)","(-2,9)","(3,4)","(10,11)"};
int x1 = Integer.parseInt(input[0].substring(input[0].indexOf("(")+1,input[0].indexOf(",")));
int x2 = Integer.parseInt(input[0].substring(input[0].indexOf(",")+1,input[0].indexOf(")")));
int x1 = Integer.parseInt(input[0].substring(input[0].indexOf("(")+1,input[0].indexOf(",")));
int y1 = Integer.parseInt(input[0].substring(input[0].indexOf(",")+1,input[0].indexOf(")")));
int x2 = Integer.parseInt(input[1].substring(input[1].indexOf("(")+1,input[1].indexOf(",")));
int y2 = Integer.parseInt(input[1].substring(input[1].indexOf(",")+1,input[1].indexOf(")")));
int x3 = Integer.parseInt(input[2].substring(input[2].indexOf("(")+1,input[2].indexOf(",")));
int y3 = Integer.parseInt(input[2].substring(input[2].indexOf(",")+1,input[2].indexOf(")")));
int x4 = Integer.parseInt(input[3].substring(input[3].indexOf("(")+1,input[3].indexOf(",")));
int y4 = Integer.parseInt(input[3].substring(input[3].indexOf(",")+1,input[3].indexOf(")")));



System.out.println(x1+x2+x3+x4+y1+y2+y3+y4);
	*/
		
	String s = "X,O,-,<>,-,O,-,<>,O,X,-";
	String sp[] = s.split(",");

	System.out.println(sp[1].equals(sp[9]));
	}
	
	static List sort(int i, List l)
	{
		List<Integer> l1 = new ArrayList();
		
		if(l.size()==0)
			return l;
		
		if(i<(Integer)l.get(0))
		{
			System.out.println("Yes");
			l.add(0, i);
			return l;
		}
		
		else
		{
			System.out.println("Yes1 : "+l.get(0));
			//l.add(0,l.get(0));
			l1.add((Integer) l.get(0));
			l.remove(0);
			l = sort(i, l.subList(0, l.size()));
			return l1;
		}
		
	}


static int fact(int n)
{
	if(n==1)
		return 1;
	
	return n * fact(n-1);
}

static void revString(String s){
	if(s.length()==0)
		return;
	System.out.println(s.charAt(s.length()-1));
	revString(s.substring(0, s.length()-1));
}

}
