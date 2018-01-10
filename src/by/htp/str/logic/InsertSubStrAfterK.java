package by.htp.str.logic;

public class InsertSubStrAfterK {

	public void insSubStrK(StringBuilder sb, int k, String s) {

		if (k < sb.length()) {
			sb.insert((k - 1), s);
		} else
			sb.append(s);
		System.out.println(sb);

	}
}
