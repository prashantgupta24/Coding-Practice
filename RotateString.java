package p1;

public class RotateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "lohel";
		System.out.println(rotStr(s1,s2, s2.length()));
		//System.out.println(rotate(s1));
		
	}
	
	static boolean rotStr(String s1, String s2, int len)
	{
		System.out.println(s1+":"+s2+":"+len);
		if(s1.equalsIgnoreCase(s2))
			return true;
		if(len==1)
			return false;
		
		return rotStr(s1,rotate(s2),len-1);
		
	}
	
	static String rotate(String s)
	{
		String ans = "";
		ans = s.charAt(s.length()-1) + s.substring(0, s.length()-1);
		return ans;
		
	}

}
