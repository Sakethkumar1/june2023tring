class Student{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
Void displayinformation(){System.out.println(rollno+" "+name);}
}
class TestStudent4{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(111,"karan");
s2.insertRecord(222,"Saketh");
s1.displyinformation();
s2.displyinformation();
}
}