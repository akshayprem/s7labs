import java.io.*;
import java.util.Scanner;
class npr
{
public static int fact(int num)
{
int s,i;
s=1;
for(i=1;i<=num;i++)
{
s=s*i;
}
return s;
}
public static void main(String args[])
{
int r1,r2,n,r;
Scanner in=new Scanner(System.in);
System.out.println("enter the value for n");
n=in.nextInt();
System.out.println("enter the value for r");
r=in.nextInt();
r1=fact(n)/fact(n-r);
System.out.println("value of npr is:" +r1);
r2=fact(n)/(fact(n-r)*fact(r));
System.out.println("value of ncr is:" +r2);
}
}
 