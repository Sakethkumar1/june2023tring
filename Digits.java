import java.util.Scanner;
public class Digits {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=(10)-1;i++){
if(str.charAt(i)=='3'){
count++;
}
}
System.out.print(count);
}
}