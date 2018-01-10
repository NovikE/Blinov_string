package by.htp.str.logic;

public class Rep {

	public String replaceK(String s, int k, char c) {

		char[] ch;
		String[] str;
		s.trim();
		str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			int dl = str[i].length();
			ch = str[i].toCharArray();
			if (ch.length >= k) {
				for (int j = (k - 1); j < ch.length; j += k) {
					if ((ch[j] != '.') & (ch[j] != ',') & (ch[j] != ':') & (ch[j] != '-')) {
						ch[j] = c;
					}
				}
				str[i] = "";

				for (int n = 0; n < dl; n++) {
					str[i] = str[i] + ch[n];
				}
			}
		}
		s = "";
		for (int i = 0; i < str.length; i++) {
			s = s + str[i] + " ";
		}
		s.trim();

		return s;

	}

}
