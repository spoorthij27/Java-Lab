import java.util.*;
import java.lang.*;
class Book{
String name,author;
double price;
int num_pages;
void getdetails()
{
Scanner b=new Scanner(System.in);
System.out.println("Enter the name of the book");
name=b.next();
System.out.println("Enter the author of the book");
author=b.next();
System.out.println("Enter the price of the book");
price=b.nextDouble();
System.out.println("Enter the number of pages in the book");
num_pages=b.nextInt();
}
void display()
{
System.out.println("Details of the book");
System.out.println("Name of the book:"+name);
System.out.println("Author of the book:"+author);
System.out.println("Price of the book:"+price);
System.out.println("Number of pages in the book:"+num_pages);
}
}
class B{
public static void main(String args[])
{
Book b1[]=new Book[2];
for(int i=0;i<2;i++)
b1[i]=new Book();
for(int j=0;j<2;j++)
b1[j].getdetails();
for(int k=0;k<2;k++)
b1[k].display();
}
}
