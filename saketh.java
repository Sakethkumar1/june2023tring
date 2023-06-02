class saketh{
public void playingsaketh1(){
System.out.print("playingsaketh1 called from classsaketh");
}
public void playingsaketh2(){
System.out.print("playingsaketh2 called from classsaketh");
}
}
class B{
public static void main (String args[]){
saketh ob=new saketh();
ob.playingsaketh1();
ob.playingsaketh2();
}
}