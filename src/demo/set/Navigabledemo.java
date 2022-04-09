package demo.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigabledemo {
public static void main(String[] args) {
	NavigableSet<Integer> setints = new TreeSet<>();
	setints.add(2);
	setints.add(28);
	setints.add(23);
	setints.add(74);
	setints.add(89);
	System.out.println(setints);
	
	System.out.println("what is the element, lower of 74: "+setints.lower(74));
	System.out.println("what is the element, floor of 74: "+setints.floor(74));
	System.out.println("what is the element, higher of 74: "+setints.higher(74));
	System.out.println("what is the element, ceiling of 74: "+setints.ceiling(74));
	System.out.println("------------------------------------------------------");
	System.out.println("what is the first element: "+setints.first());
	System.out.println("what is the last element: "+setints.last());
	System.out.println("------------------------------------------------------");
	System.out.println("Descending set: "+setints.descendingSet());
	System.out.println("------------------------------------------------------");
	NavigableSet<Integer> headset = setints.headSet(74,true);
	System.out.println("headset: "+headset);
	
	headset.add(8); // add less than headset elem
	System.out.println("headset: "+headset);
	System.out.println("original set: "+setints);
	
}


}
