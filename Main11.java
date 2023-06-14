
import java.util.Vector;
class Main11{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("Dog");
mammals.add("Cat");
mammals.add(2,"Ant");
System.out.println("Vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("Crocodile");
animals.addAll(mammals);
System.out.println("New Vector:"+animals);

}}