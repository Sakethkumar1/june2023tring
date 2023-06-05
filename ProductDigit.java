import java.util.Scanner;
class ProductDigit {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;//hold num
int pd=1; //hold sum digit
System.out.print("Enter the positive integer: ");
n=sc.nextInt();
while(n>0){
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
}