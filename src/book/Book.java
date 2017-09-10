package book;

import java.util.Scanner;


abstract class Book {

 String title;
 String author;

 public Book(String t, String a){
     title = t;
     author = a;
}
 
   public abstract void display();

}

class MyBook extends Book{

    private int price;
    
    public MyBook (String t, String a, int p){
    
        super(t,a);
        price = p;
}

    @Override
     public void display() {
        System.out.println("Title: "+ title + "\nAuthor: " + author + "\nprice: " +price);
    }
}

 class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}