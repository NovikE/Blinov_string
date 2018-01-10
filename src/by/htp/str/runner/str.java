package by.htp.str.runner;

import by.htp.str.logic.InsertSubStrAfterK;
import by.htp.str.logic.RemoveSubstr;
import by.htp.str.logic.Rep;
import by.htp.str.logic.RepToASCII;
import by.htp.str.logic.RepeatWords;

public class str {

	public static void main(String[] args) {

		Rep repK = new Rep();

		String s = "When BEI value is mentioned in ZFV_INVNUM table, only number ranges are exclusively used"
				+ "  for that particular BEI, if the BEI field is left blank, then, that number range can be "
				+ "assigned for any BEI.";

		int k = 3;
		char c = 'A';

		System.out.println("Initial string:");
		System.out.println(s);

		System.out.println("New string:");
		System.out.println(repK.replaceK(s, k, c));
		
		System.out.println("---------------------------");
		RepToASCII repASCII = new RepToASCII();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		repASCII.repToASCII(sb);
		
		System.out.println("---------------------------");
		InsertSubStrAfterK insK = new InsertSubStrAfterK();
		String s1 = "GGGGGGGGGGGGGGGGGGGGGGG";
		insK.insSubStrK(sb, 5, s1);
		
		System.out.println("---------------------------");
		RepeatWords repW = new RepeatWords();
		s = "rose, tulip, camille, rose, rose, tulip, camille, tulip, rose, tulip, camille, camille.";
		repW.repeatHowMuch(s);
		
		System.out.println("---------------------------");
		RemoveSubstr rem = new RemoveSubstr();
		rem.remMaxSubstr(s);
		
				
	    }
	
	
}

