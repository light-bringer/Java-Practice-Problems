package hackerrank.thirty;

import java.util.Scanner;

abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();

}



class MyBook extends Book {
	

	int price;

	MyBook(String t, String a, int p) {
		super(t, a);
		this.price = p;
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
		
	}
	
}

public class AbstractConcepts {
	
	public static void main(String []args)
	   {
	      Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel=new MyBook(title,author,price);
	      new_novel.display();
	      sc.close();
	   }

}
