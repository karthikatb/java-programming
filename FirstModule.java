
class Main{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="central library";
	Main(){
		this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.bookID = ++bookCounter; 	
				
	}
	Main(String author,String title){
		this.author=author;
		this.title=title;
		this.bookID = ++bookCounter; 
	}
	public void displayInfo() {
		System.out.println("Author:"+author);
		System.out.println("Title:"+title);
		System.out.println("ID="+bookID);
	}
	public void displayInfo(boolean showLibrary) {
		if (showLibrary) {
			System.out.println(LIBRARY_NAME);
		}
	}
	public static void displayTotalBooks() {
		System.out.println(bookCounter-1000);
	}
}


public class FirstModule {
	public static void main(String[] args) {
		Main b2 = new Main("The Alchemist", "Paulo Coelho");
        b2.displayInfo();
        b2.displayInfo(false);
        
		Main b3 = new Main("Java Basics", "James Gosling");
		b3.displayInfo();
		b3.displayInfo(true);
		
		Main.displayTotalBooks();
	}

}
