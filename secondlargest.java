import java.io.*;
import java.util.Scanner;
class secondlargest
{
public static void main(String args[])
{
int a[]=new int[10];
int i,j,n,t,m;
Scanner in=new Scanner(System.in);
System.out.println("enter the range");
n=in.nextInt();
System.out.println("enter the array elements");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}

for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]<a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(" "+a[i]);
}
for(m=1;m<n;)
{
if(a[m]!=a[m-1])
{
	//System.out.println(a[m]);
	break;
}
else
	m++;
}
System.out.println("the second largest number is:" + a[m]);
}
}




