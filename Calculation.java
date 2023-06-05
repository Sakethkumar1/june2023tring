class Calculation{
void fact(int n){
int fact=1;
for(int j=1;j<=n;j++){
fact=fact*j;
}
System.out.println("factorial is"+fact);
}
public static void main(String args[])
{
new Calculation().fact(5);
}
}