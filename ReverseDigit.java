import java.util.Scanner;
class ReverseDigit {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;//hold num
int rd=0; //hold rev digit
System.out.print("Enter the positive integer: ");
n=sc.nextInt();
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
System.out.println(rd);
}
}