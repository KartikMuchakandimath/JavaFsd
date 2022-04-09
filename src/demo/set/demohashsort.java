//package demo.set;
//
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class demohashsort {
//public static void main(String[] args) {
//	NewBook book1 = new NewBook("Harry","jk",1997);
//	NewBook book2 = new NewBook("beast","kk",1987);
//	NewBook book3 = new NewBook("java","ja",2008);
//	NewBook book4 = new NewBook("oops","oop",2000);
//	NewBook book5 = new NewBook("Harry","jk",1997);
//	
//	Set<NewBook> books = new TreeSet<>();
//	books.add(book1);
//	books.add(book2);
//	books.add(book3);
//	books.add(book4);
//	books.add(book5);
//	printbook(books);
//}
//
// static void printbook(Set<NewBook> books) {
//	for(NewBook book: books) {
//		System.out.println(book);
//		
//	}
//}
//}
//	
//
//
//class NewBook implements Comparable<NewBook>{
//private String title;
//private String author;
//private int year;
//public NewBook(String title, String author, int year) {
//	this.title = title;
//	this.author = author;
//	this.year = year;
//}
//public String getTitle() {
//	return title;
//}
//@Override
//public String toString() {
//	return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
//}
//@Override
//public int hashCode() {
//	return Objects.hash(author, title, year);
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	NewBook other = (NewBook) obj;
//	return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
//}
//@Override
//public int compareTo(NewBook otherBook) {
//	return this.title.compareTo(otherBook.title);
//}
//}
//	
//
//
//
//
