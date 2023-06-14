
import java.util.ArrayList;
class Main10{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("Dog");
animals.add("Cat");
animals.add("Ant");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp:animals){
System.out.print(temp);
System.out.print(",");
}
}}