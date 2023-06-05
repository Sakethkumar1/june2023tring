import java.util.Scanner;
class sumDigit {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;//hold num
int sd=0; //hold sum digit
System.out.print("Enter the positive integer: ");
n=sc.nextInt();
while(n>0){
sd=sd+n%10;
n=n/10;
}

System.out.println(sd);
}
}