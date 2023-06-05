import java.util.Scanner;
class ReverseString {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String n;//hold num
String rs=""; //hold rev digit
System.out.print("Enter a String: ");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}