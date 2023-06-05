public class StrJoin{
public static void main(String args[]){
String s1=new String("Hello");//s1
String s2=new String("World");//s2
String s3=new String("Java");//s3
String s=String.join("#",s1,s2);//String 3to store the result
System.out.println(s.toString());
}
}