package by.htp.str.logic;

public class RemoveSubstr {
	
	public void remMaxSubstr(String s) {
		String substr = "";
		String substrFinal = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j > 0; j--) {
				if (j < i) {
					break;
				}
				if (s.charAt(i) == s.charAt(j - 1)) {
					substr = s.substring(i, j);
					if (substr.length() > substrFinal.length()) {
						substrFinal = substr;
					}
					break;
				}

			}

		}

		System.out.println(s);
		s = s.replace(substrFinal, "");
		System.out.println(s);
	}

}
