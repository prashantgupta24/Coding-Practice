package p1;

import java.util.ArrayList;
import java.util.List;

public class Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(3);
		l.add(2);
		l.add(4);
		l.add(1);
		l.add(5);
		l.add(8);
		l.add(19);
		l.add(29);
		l.add(6);
		
		System.out.println("Element : "+ search(19, l));

	}
	
	private static boolean search(Integer x, List list)
	{

		if(list.size()==0)
			return false;

		if(x==list.get(0))
			return true;
		else
		{
			return search(x,list.subList(1, list.size()));
		}
	}

	private static int getMinValue(List<Integer> l) {
		// TODO Auto--generated method stub
		
		if(l.size()==1)
			return l.get(0);
		
		return min(l.get(0), getMinValue (l.subList(1, l.size())));
	}

	private static int min(Integer i1, int i2) {
		// TODO Auto-generated method stub
		
		int i11 = i1.intValue();

		if(i11<i2)
			return i11;
		else
			return i2;
	}

}
