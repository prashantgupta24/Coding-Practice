package p1;

public class Interleaving {

	public static void main(String[] args) {
		
		System.out.println(interLeaving_rec("xxxxxx", "xxx", "xxx"));
	}
	
	static boolean interLeaving_rec(String mainString, String s1, String s2) 
	{
		System.out.println(mainString+" : "+s1+" : "+s2);
		
		if(mainString.length() != s1.length() + s2.length())
			return false;
		
		if(mainString.length() ==0 && s1.length() == 0 && s2.length() ==0)
			return true;
		
		if(s1.length() >0 && mainString.charAt(0) == s1.charAt(0))
		{
			if(s1.length()>1)
				return interLeaving_rec(mainString.substring(1), s1.substring(1), s2);
			else
				return interLeaving_rec(mainString.substring(1), "", s2);
		}
		else
			if(s2.length() >0 && mainString.charAt(0) == s2.charAt(0) && s2.length() > 0)
			{
				if(s2.length()>1)
					return interLeaving_rec(mainString.substring(1), s1, s2.substring(1));
				else
					return interLeaving_rec(mainString.substring(1), s1, "");
					
			}
		
			return false;

	}
	
	static void interLeaving_itr(String mainString, String s1, String s2)
	{
		
	}
}
