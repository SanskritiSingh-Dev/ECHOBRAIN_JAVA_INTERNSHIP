public class Book {
    String title;
    String author;
    double price;
    
    //constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }
    //method to display
    public void display(){
        System.out.println("title ofthe book is " + title);
        System.out.println("Author of the book is "+ author);
        System.out.println("Price ofthe book is " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("The art of letting go","Ritvik Singh", 299);
        b1.display();
    }

}