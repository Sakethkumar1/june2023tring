class Employee{
int id;
String name;
float salary;
void insert(int j,String n,float s){
id=j;
name=n;
salary=s;
}
void display(){System.out.println(id+""+name+""+salary);}
}
public class TestEmployee{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(101,"saketh",12000);
e2.insert(102,"karthik",30000);
e3.insert(103,"ravi",20000);
e1.display();
e2.display();
e3.display();
}
}