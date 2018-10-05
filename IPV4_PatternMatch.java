package algorithm;

public  class IPV4_PatternMatch {
	

	
	static boolean matchIPv4(String s){
				
		String pat = "^(((2[0-5]?[0-5]?)|([0-1][0-9]?[0-9]?)|[3-9][0-9]?)\\.){3}((2[0-5]?[0-5]?)|([0-1][0-9]?[0-9]?)|[3-9][0-9]?)$";
		
				return 	s.matches(pat);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"256.20.20.3","0.02.255.7","0.0.0.0","255.089.089.0","254.254.089.099","99.99.254.3","199.199.000.99"};
		for(int k = 0; k < s.length;k++)
		System.out.println(matchIPv4(s[k]));
	}

}

