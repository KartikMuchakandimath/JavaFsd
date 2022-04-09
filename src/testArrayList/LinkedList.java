package testArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
	public static void main(String[] args) {
		List<String> PlacesToVisit = new ArrayList<String>();
		PlacesToVisit.add("Banglore");
		PlacesToVisit.add("Mysore");
		PlacesToVisit.add("hubli");
		PlacesToVisit.add("kashmir");
		
		System.out.println(PlacesToVisit.contains("Mysore"));
		
		System.out.println(PlacesToVisit.indexOf("hubli"));
		//print(PlacesToVisit); //print fun
		print2(PlacesToVisit); //print fucn // removing elem
		print(PlacesToVisit);
		//printList3(PlacesToVisit);
	}
		//printing elements in lilnked list
		private static void print(List<String> mylist) {
			
			Iterator<String> it = mylist.iterator();
			
			while(it.hasNext()) {
				String element = it.next();
				System.out.println("now visiting..."+element);
			}
			System.out.println("-------------------------------------");
		}
		// removing elem from linked list
			private static void print2(List<String> mylist) {
				Iterator<String> it = mylist.iterator();
				while(it.hasNext()) {
					String element = it.next();
					
					if(element.equalsIgnoreCase("hubli")) {
						System.out.println("removing hubli");
						it.remove();
					}
					System.out.println("now visiting..."+element);
				}
				System.out.println("-------------------------------------");
		}
			
			// another approach to print linkedlist 
			private static void printList3(List<String> mylist) {
				for (Iterator it= mylist.iterator(); it.hasNext();) {
					
					if(it.equals("Mysore")) {
						it.remove();
					}
			         System.out.println(it.next());
			         
			        
				}
			}
	


}
