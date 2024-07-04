package project1;

public class Book {
	private int id;
	private String name;
	private int price;
	private String type;
	private String author;
	private int copies;
	public Book(int id, String name, int price, String type, String author, int copies) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.author = author;
		this.copies = copies;

	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public String getAuthor() {
		return author;
	}
	public int getCopies() {
		return copies;
	}
}
