package p1;

import java.util.ArrayList;
import java.util.List;

public class RemDups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int forLoopValue = 0;
		String answer = "";
		String s = "geeksforgeek";
		List list = new ArrayList<Integer>();
		
		for (int i = 0; i < 256; i++) {
			forLoopValue++;
			list.add(0);
		}
		
		for (int i = 0; i < s.length(); i++) {
			
			forLoopValue++;
			int ascii = (int)s.charAt(i);
			int val = Integer.valueOf((Integer) list.get(ascii));
			if(val == 0)
			{
				val++;
				list.remove(ascii);
				list.add(ascii, val);
				answer=answer+s.charAt(i);
			}


		}
		
		System.out.println(answer + " : " +forLoopValue);
		
/*		int max=0;
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
		System.out.println("MAX : "+ Character.toString((char)index));*/

	}

}
