import java.io.*;
import java.util.Scanner;
class palin
{
public static void main(String args[])
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("enter the string");
s=in.nextLine();
String reverse = new StringBuffer(s).reverse().toString();
System.out.println(reverse);
if(s.equals(reverse))
{
System.out.println("palindrome");
}
else
System.out.println("not palindrome");
}
}