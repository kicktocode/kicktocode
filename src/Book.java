import com.sun.source.tree.NewArrayTree;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Book {
    String title;
    String author;
    int ISBN;
    public static ArrayList<Book>bookcollection=new ArrayList<Book>();
    Book(String title,String author,int ISBN){
        this.author=author;
        this.title=title;
        this.ISBN=ISBN;
    }


    public String getAuthor() {
        return author;
    }
    public  void setAuthor(String Author){
        this.author=author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN=ISBN;
    }
    public static void addBook(Book book){
        bookcollection.add(book);
    }
    public static void removeBook(Book book){
        bookcollection.remove(book);
    }
      public static ArrayList<Book> getbookcollection() {
        return bookcollection;
    }
}

class book2 {
    public static void main(String[] args) {
        Book obj1 = new Book("Dawn", "Tom", 125);
        Book obj2 = new Book("Step Forward", "Nike", 13);
        Book.addBook(obj1);
        Book.addBook(obj2);
        ArrayList<Book> bookcollection = Book.getbookcollection();
        System.out.println("list of book are ");
        for (Book book : bookcollection) {
            System.out.println("Author : " + book.getAuthor()+","+"Title : " + book.getTitle()+","+ "ISBN : " + book.getISBN());

        }
        Book.removeBook(obj1);
        System.out.println("list of books after removing");
        for (Book book : bookcollection) {
            System.out.println("Author : " + book.getAuthor());
            System.out.println("Title : " + book.getTitle());
            System.out.println("ISBN : " + book.getISBN());

        }
    }
}