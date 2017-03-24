package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args){
		if(args.length < 2){
			System.out.println("Usage:\njava TestRegularExpression characterSequence regularExpression");
			System.exit(0);
		}
		System.out.println("Input:\"" + args[0] + "\"");
		for(String arg : args){
			System.out.println("Regular Expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()){
				System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}
}
//abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}"
//"Java now has regular expressions" "^java" "\Breg.*" "n.w\s+h(a|i)s" "s?" "s*" "s+" "s{4}" "s{1}" "s{0,3}"
//"Arline ate eight apples and one orange while Anita hadn't any" "(?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b"