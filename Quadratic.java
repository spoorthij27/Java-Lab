import java.util.*;
import java.lang.Math.*;
public class Quadratic
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a");
double a=in.nextDouble();
System.out.println("Enter b");
double b=in.nextDouble();
System.out.println("Enter c");
double c=in.nextDouble();
if(a==0)
{
System.out.println("Invalid Inputs \n ");
}
else
{
double d=b*b-4*a*c;
if(d>0.0)
{
double r1=(-b+(Math.sqrt(d)/(2.0*a)));
double r2=(-b-(Math.sqrt(d)/(2.0*a)));
System.out.println("Roots are real and distinct \n Roots are \n r1="+r1+"\n r2="+r2);
}
else if(d==0.0)
{
double r1=-b/(2*a);
System.out.println("Roots are real and equal and each root is equal to"+r1);
}
else
{
System.out.println("Roots are imaginary and distinct. \n Roots are\n");
double r1=-b/(2.0*a);
double r2=(Math.sqrt(Math.abs(d)))/(2.0*a);
System.out.println("r1= "+r1+"+i"+r2+"\n"+"r2= "+r1+"-i"+r2);
}
}
}
}
