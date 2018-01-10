package by.htp.str.logic;

public class RepeatWords {

	public void repeatHowMuch(String s) {

		String[] str;
		int count = 0;
		int q = 0;

		

		s = s.replace(',', ' ');
		s = s.replace('.', ' ');
		s = s.replace('-', ' ');
		s = s.replace(':', ' ');
		// System.out.println(s);

		str = s.split(" ");
		String[] str1 = new String[str.length];

		for (int i = 0; i < str.length; i++) {
			str[i].trim();
			count = 0;
			if (!str[i].equals("")) {
				for (int z = 0; z < str.length; z++) {
					if (str[i].equals(str[z])) {
						count++;
					}
				}
				str1[q] = "Word '" + str[i] + "' repeats " + count + " times.";
				q++;
			}
		}

		for (int i = 0; i < (q - 1); i++) {
			for (int m = (i + 1); m < (q - 1); m++) {
				if (str1[i].equals(str1[m])) {
					str1[m] = "";
				}
			}
		}
		for (int i = 0; i < (q - 1); i++) {
			if (!str1[i].equals("")) {
				System.out.println(str1[i]);
			}

		}

	}

}
