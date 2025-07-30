class Book{
	String title;
	String author;
	double price;
	int quantity;
	double Total;
Book(String title,String author,double price,int quantity){
	this.title=title;
	this.author=author;
	this.price=price;
	this.quantity=quantity;
}
public void TotalValue() {
	Total=price*quantity;
}
public void display() {
	System.out.println("Title:"+title);
	System.out.println("Author:"+author);
	System.out.println("Price:"+price);
	System.out.println("Title"+quantity);
	System.out.println("Total value="+Total);
}
}
public class BookDetails {
	public static void main(String[] args) {
		Book book1=new Book("Light","Willliam",250,2);
		book1.TotalValue();
		book1.display();
		Book book2=new Book("Soul","ONV",500,1);
		book2.TotalValue();
		book2.display();
	}

}
