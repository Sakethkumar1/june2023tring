class Student{
int rollno;
String name;
static string college="TTS";
Student(int i,String n);
rollno =i;
name =n;
}
void display(){System.out.println(rollno+""+name+""+college);}
public class TestStaticVariable{
public static void main(String args[]){
Student s1=new Student(111,"Kiran");
Student s2=new Student(222,"Arun");
Student.college="A.M.REDDY";
s1.display();
s2.display();
}
}