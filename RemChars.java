package p1;

public class RemChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcabcdddacffff";
		String ans = "";
		boolean ac = false;
		
		for (int i = 0; i < s1.length(); i++) {

			char charAt = s1.charAt(i);
			
			if(charAt == 'b')
			{
				ac = false;
				continue;
			}
			else
				if(charAt == 'a')
				{
					ac = true;
					ans = ans + charAt;
					continue;
				}
			
				else
					if(charAt == 'c' && ac == true)
					{
						ans = ans.substring(0, ans.length()-1);
					}
					else
					{
						ac = false;
						ans = ans + charAt;
					}
			
			
		}

		System.out.println("Answer : "+ans);
	}

}
