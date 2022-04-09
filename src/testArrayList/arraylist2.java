package testArrayList;
import java.util.ArrayList;
import java.util.List;

import oop5.Movie;
public class arraylist2 {
	public static void main(String[] args) {
		List<String> strlist = new ArrayList<String>();
		strlist.add("hi");
		strlist.add("java");
		strlist.add("full");
		strlist.add("stack");
		strlist.add("dev");
		
		for(String str:strlist)
			System.out.println(str);
		
		
		System.out.println("-------------------------------------");
		
		List<Integer> intlist= new ArrayList<Integer>() ;
		intlist.add(2);
		intlist.add(3);
		intlist.add(26);
		intlist.add(29);
		
		for(Integer ints:intlist)
			System.out.println(ints);
		
		System.out.println("-------------------------------------");
		
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(StarWars());
	//	movies.add()
		for(Movie movie:movies)
			System.out.println(movie);
	}

	private static Movie StarWars() {
		System.out.println("good movie");
		return null;
	}

}
