package by.htp.str.logic;

public class RepToASCII {

	public void repToASCII(StringBuilder sb) {
		
		char[] ch = new char[sb.length()];
		char[] ch1 = new char[sb.length()];
		int[] l = new int[sb.length()];
		int j = 0;

		for (int i = 0; i < sb.length(); i++) {
			ch[i] = sb.charAt(i);
			if ((ch[i] != '.') & (ch[i] != ',') & (ch[i] != ':') & (ch[i] != '-') & (ch[i] != ' ') & (ch[i] != '?')
					& (ch[i] != '!')) {
				l[j] = (int) ch[i];
				ch1[j] = ch[i];
				j++;
			}
		}

		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
	}
}
