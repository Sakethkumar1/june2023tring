import java.util.Scanner;
class test3a{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int nuc=sc.nextInt();
for(int i=0;i<=num;i=i+nuc)
{
System.out.print(i+",");
}
}
}