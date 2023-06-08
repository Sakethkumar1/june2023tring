class Student{
int rollno;
String name;
static String college="TTS";
static void change(){
college="A.M.REDDY";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+""+name+""+college);}
}
class TestStaticMethod{
public static void main(String args[]){
Student.change();
Student s1=new Student(111,"Kiran");
Student s2=new Student(222,"Kavya");
Student s3=new Student(333,"Arun");
s1.display();
s2.display();
s3.display();
}
}
