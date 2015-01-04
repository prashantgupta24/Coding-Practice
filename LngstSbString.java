package p1;

import java.util.ArrayList;
import java.util.List;

public class LngstSbString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "ABDEFGABEF";

		String subString = "";
		String longSubStr = "";
		
		List list1 = new ArrayList<Integer>();
		List list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 256; i++) {
			//forLoopValue++;
			list1.add(0);
			list2.add(0);
		}
		
		for (int i = 0; i < s1.length(); i++) {
			
			//forLoopValue++;
			int ascii = (int)s1.charAt(i);
			int val1 = Integer.valueOf((Integer) list1.get(ascii));
			int val2 = Integer.valueOf((Integer) list2.get(ascii));
			//System.out.println("VAL1 : "+val1);
			//System.out.println("VAL2 : "+val2);
			if(val1-val2>0)
			{
				if(subString.length() >= longSubStr.length())
				{	
					//System.out.println(subString+" : "+longSubStr+" : "+s1.charAt(i));
					longSubStr = subString;
					subString = "";
					//subString = subString + s1.charAt(i);
					list2.removeAll(list1);
					list2.addAll(list1);
					//continue;
				}

			}
			val1++;
			subString = subString + s1.charAt(i);
			list1.remove(ascii);
			list1.add(ascii, val1);
		}
		
		System.out.println(longSubStr);
		
	}

}
