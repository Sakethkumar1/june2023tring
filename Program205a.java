import  java.util.*;
public class Program205a
{
public static void main(String[] args)
{char ch;
System.out.print("Enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
System.out.println(ch+"is an alphabet");
else
system.out.println(ch+"is not alphabet");
}
}