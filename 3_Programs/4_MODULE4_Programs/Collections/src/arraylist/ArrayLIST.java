package arraylist;

import java.util.*;

class Book {

	int id;
	String title;
	String author;
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void printBookInfo() {
		System.out.println("Book id = " + id);
		System.out.println("Book name = " + title);
		System.out.println("Book id = " + author);
	}
}

public class ArrayLIST {
	
	static void printBookEx(ArrayList <Book> shelf) {
        System.out.println("Books in the BookShelf:");

		for (int i=0; i<shelf.size(); i++) {
			
            Book b = shelf.get(i);

			System.out.println(b.id + " " + b.title + " " + b.author);
		}
		System.out.println();
	}
	
	// for each .. loop
	static void printBook(ArrayList <Book> shelf) {
        System.out.println("Books in the BookShelf:");

		for (Book b: shelf) {
			System.out.println(b.id + " " + b.title + " " + b.author);
		}
		System.out.println();
	}
	
	public static void parseBookShelf(
			ArrayList<Book> shelf) {
        Iterator<Book> iterator = shelf.iterator();

        System.out.println("Books in the BookShelf:");

        while (iterator.hasNext()) {
            Book b = iterator.next();
			System.out.println(b.id + " " + b.title + " " + b.author);

        }
    }
	
	public static void main(String[] args) {
	    ArrayList <Book> bookShelf = new ArrayList <Book>();

		Book book1 = new 
				Book(1,"book_title1", "book_author1");
		Book book2 = new
				Book(2,"book_title2", "book_author2");
		Book book3 = new Book(3,"book_title3", "book_author3");
		Book book4 = new Book(4,"book_title4", "book_author4");
		Book book5 = new Book(5,"book_title5", "book_author5");

		// Add book - use of add()
		bookShelf.add(book1);
		bookShelf.add(book2);
		bookShelf.add(book3);
		bookShelf.add(book4);
		bookShelf.add(book5);

		// print info
		printBookEx(bookShelf);
		printBook(bookShelf);
		parseBookShelf(bookShelf);
		
		
		// add at index - insert at inde 4
		Book book6 = new Book(6,"book_title6", "book_author6");
		bookShelf.add(4, book6);
		printBook(bookShelf);
		
		// remove from index 4
		bookShelf.remove(4);
		printBook(bookShelf);
		
		// add all - bookshelf to booklist
		ArrayList <Book> bookList = new ArrayList <Book>(); 
		bookList.addAll(bookShelf);
		printBook(bookList);

		// clear bookList
		bookList.clear();
		
		// create a new arraylist
		Book b1 = new Book(101,"book_title101", "book_author101");
		Book b2 = new Book(102,"book_title102", "book_author102");
		Book b3 = new Book(103,"book_title103", "book_author103");
		Book b4 = new Book(104,"book_title104", "book_author104");
		Book b5 = new Book(105,"book_title105", "book_author105");
		// add b1,b2...b5 to bookList
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		printBook(bookList);

		// add all at index, from 2nd index, bookshelf will be inserted
		bookList.addAll(2, bookShelf);
		printBook(bookList);

		// clear bookList
		bookList.clear();
		
		// contains
		boolean status = bookShelf.contains(book5);
		System.out.println("Book shelf caontain book 6 = " + status);
		status = bookShelf.contains(b1);
		System.out.println("Book shelf caontain b1 = " + status);

		// containsAll
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		status = bookShelf.containsAll(bookList);
		System.out.println("Book shelf caontains all bookList = " + status);
		
		// equals
		status = bookList.equals(bookList);
		System.out.println("bookList equals bboList = " + status);
		status = bookList.equals(bookShelf);
		System.out.println("bookList equals bookShelf = " + status);

		// get(index)
		Book b = bookShelf.get(0);
		System.out.println("book title = " + b.title);
		
		// indefOf(Object)
		int val = bookShelf.indexOf(book1);
		System.out.println("Index of book1 in bookshelf = " + val);
		val = bookShelf.indexOf(book6);
		System.out.println("Index of book6 in bookshelf = " + val);
		System.out.println();
		
		// toArray() - method 1
		Object obj[] = bookShelf.toArray();
		for (int i=0; i<obj.length; i++) {
			System.out.println("book [" + i + "] = " + ((Book)obj[i]).id + " " + ((Book)obj[i]).title);
		}
		System.out.println();
		
		// toArray() - method 2
		Book books[] = new Book[bookShelf.size()];
		books = bookShelf.toArray(books);
		for (int i=0; i<books.length; i++) {
			System.out.println("book [" + i + "] = " + books[i].id + " " + books[i].title);
		}
		System.out.println();
		
		// remove at index
		bookShelf.remove(0);
		printBook(bookShelf);
		
		// remove object - return true if success
		status = bookShelf.remove(book1);
		System.out.println("book1 removed  = " + status);
		status = bookShelf.remove(book2);
		System.out.println("book2 removed  = " + status);
		printBook(bookShelf);
		
		// iterator
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book B2 = (Book)it.next();
			System.out.println(B2.id + " " + B2.title + " " + B2.author);
		}
		System.out.println();

		// listInterator -  add uising ListIterator
		// iterator doesnt have add()/Remove() feature
		ListIterator lit = bookShelf.listIterator();
		while(lit.hasNext()) {
			Book B2 = (Book)lit.next();
			System.out.println(B2.id + " " + B2.title + " " + B2.author);
			
			if (B2.id == 3) {
				lit.add(book1);
			}
		}
		System.out.println();
		printBook(bookShelf);
		
		// listInterator -  Remove uising ListIterator
		lit = bookShelf.listIterator();
		while(lit.hasNext()) {
			Book B2 = (Book)lit.next();
			System.out.println(B2.id + " " + B2.title + " " + B2.author);
			if (B2.id == 1) {
				lit.remove();
			}
		}
		System.out.println();
		printBook(bookShelf); 
	}

}
