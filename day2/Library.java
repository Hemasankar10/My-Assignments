package week1.day2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library bk = new Library();
		String bookName=bk.addBook("Kubernetes");
		System.out.println(bookName);
		bk.issueBook();
		
	}

}
