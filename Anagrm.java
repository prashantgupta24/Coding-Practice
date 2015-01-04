package p1;

import java.util.ArrayList;
import java.util.List;

public class Anagrm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hoell";
		boolean res = true;
		
		List list = new ArrayList<Integer>();
		
		for (int i = 0; i < 256; i++) {
			//forLoopValue++;
			list.add(0);
		}
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.length()!= s2.length())
			{
				System.out.println("Strings not of same length");
				res = false;
				break;
			}
			//forLoopValue++;
			int ascii = (int)s1.charAt(i);
			int val = Integer.valueOf((Integer) list.get(ascii));
			val++;
			list.remove(ascii);
			list.add(ascii, val);
			
			ascii = (int)s2.charAt(i);
			val = Integer.valueOf((Integer) list.get(ascii));
			val--;
			list.remove(ascii);
			list.add(ascii, val);
		}
		
		for (int i = 0; i < list.size(); i++) {
			int val = Integer.valueOf((Integer) list.get(i));
			if(val == 0)
				continue;
			else
				res = false;
			break;
		}
		
		System.out.println(res);
		
	}

}
