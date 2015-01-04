package p1;

import java.util.ArrayList;
import java.util.List;

public class MaximumCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int forLoopValue = 0;
		String s = "a";
		List list = new ArrayList<Integer>();
		
		for (int i = 0; i < 256; i++) {
			forLoopValue++;
			list.add(0);
		}
		
		for (int i = 0; i < s.length(); i++) {
			forLoopValue++;
			int ascii = (int)s.charAt(i);
			int val = Integer.valueOf((Integer) list.get(ascii));
			val++;
			list.remove(ascii);
			list.add(ascii, val);
		}
		
		int max=0;
		int index = 0;
		for (int i = 0; i < 256; i++) {
			forLoopValue++;
			int val = Integer.valueOf((Integer) list.get(i));
			if(val>max)
			{
				max = val;
				index = i;
			}
		}
		System.out.println("For loop ran : "+forLoopValue+" times for string length : "+s.length());
		System.out.println("MAX : "+ Character.toString((char)index));

	}

}
