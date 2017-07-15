import java.io.*;
import java.util.Scanner;
class fib
{
public static void main(String args[])
{
int n,i,n1,n2,n3;
Scanner in=new Scanner(System.in);
System.out.println("enter the range");
n=in.nextInt();
n1=0;
n2=1;
System.out.println("fibonacci series:");
System.out.println(" "+n1);
System.out.println(" "+n2);
for(i=1;i<=n;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.println(" "+n3);
}
}
}


