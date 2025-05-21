public class Book{
 String title;
 String author;
public Book(String title, String author){
    this.title = title;
    this.author = author;
}
public void display(){
    System.out.println("Title of Book is:"+title); 
  System.out.println("Author is:"+author); 
 } 
 public static void main(String[] args) { 
  Book obj=new Book("helllo","bhavani"); 
  obj.display(); 
 } 
}

OUTPUT:Title of Book is:helllo
Author is:bhavani
 