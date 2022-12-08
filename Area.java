abstract class Shape{
int a,b;
Shape(int x,int y)
{
 a=x;
 b=y;
}
abstract double printarea();
}
class Rectangle extends Shape{
Rectangle(int x,int y)
{
super(x,y);
}
double printarea()
{
return a*b;
}
}
class Triangle extends Shape{
Triangle(int x,int y)
{
super(x,y);
}
double printarea()
{
return 0.5*a*b;
}
}
class Circle extends Shape{
Circle(int x)
{
super(x,1);
}
double printarea()
{
return 3.142*a*a;
}
}
class Area{
public static void main(String args[]){
Rectangle r1=new Rectangle(5,10);
Triangle t1=new Triangle(8,6);
Circle c1=new Circle(4);
Shape s;
s=r1;
double a1=s.printarea();
System.out.println("Area of rectangle is:"+a1);
s=t1;
double b1=s.printarea();
System.out.println("Area of triangle is:"+b1);
s=c1;
double d1=s.printarea();
System.out.println("Area of circle is:"+d1);
}
}
