import java.util.Iterator;
import java.util.Vector;
class Main12{
public static void main(String args[]){
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("Cat");
animals.add("Ant");
String element=animals.get(2);
System.out.println("Element at index 2:"+element);
Iterator<String>iterate=animals.iterator();
System.out.print("Vector:");
while(iterate.hasNext()){
System.out.print(iterate.next());
System.out.print(",");
}}}