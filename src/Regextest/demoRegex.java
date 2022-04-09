package Regextest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demoRegex {
public static void main(String[] args) {
//	regexbasic();
	//regextest1();
	
	//regextest2();
	regexemail();


	
	
}
private static void regexemail() {
	String email ="k@gmail.com";
	String email1 ="yahoo.com";
	String regex = "^(.+)@(.+)$";
	Pattern p = Pattern.compile(regex);

	Matcher m = p.matcher(email);
	Matcher m1= p.matcher(email1);
	System.out.println(m.matches());
	System.out.println(m1.matches());
}

private static void regexbasic() {
	Pattern p = Pattern.compile(".s");
	Matcher m =  p.matcher("aa");
	System.out.println(m.matches());
	
	System.out.println(Pattern.compile(".b").matcher("bb").matches());
	System.out.println(Pattern.compile(".c").matcher("cdc").matches());
}

private static void regextest2() {
	System.out.println(Pattern.matches("[amn]", "aas"));
	System.out.println(Pattern.matches("[anm]", "a"));
	System.out.println(Pattern.matches("[anm]", "m"));
	System.out.println(Pattern.matches("[anm]+", "mm"));
	System.out.println(Pattern.matches("[anm]", "mm"));
}

private static void regextest1() {
	System.out.println(Pattern.matches(".s", "as"));
	System.out.println(Pattern.matches(".s", "aa"));
	System.out.println(Pattern.matches(".s", "ss"));
	System.out.println(Pattern.matches(".s", "abss"));
	
}
}
