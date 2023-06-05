class Teststringcomparison3{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";
String s3=new String("Sachin");
System.out.println(s1==s2);//true(both referals to same)
System.out.println(s1==s3);//false (because s3 refers to in stance created in nonpool)
}
}