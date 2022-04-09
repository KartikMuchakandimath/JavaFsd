package arrayutilltest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayutilTest {
public static void main(String[] args) {
	String[] strarray= new String[] {"kartik","willium","mxi","virat"};
	
	List<String> strlist= Arrays.asList(strarray);
	System.out.println(strlist);
	
	strlist.set(0, "abd");
	System.out.println("List: "+strlist);
	System.out.println("updated array: "+Arrays.toString(strarray));

	Arrays.sort(strarray);
	System.out.println(Arrays.toString(strarray));
	
	List<String> list = new ArrayList<String>();
	list.add("Raj");
	list.add("john");
	list.add("Max");
	
	String[] array = {"Anita"};
	Collections.addAll(list, array);
	System.out.println(list);
}
}
