class gopi
{ 
    int age;
    int rollno;
    int phone;

  public gopi()//Default constructor
  {
    System.out.println("Hii whats app");
    age=10;
  }  
  public gopi(int a , int b,int c)// Parameterized Constructor
  { 
    System.out.println("The values are assigned:");
    age=a;
    phone=b;
    rollno=c;
  }
}
public class constructors {
    public static void main(String[] args) {
    gopi obj=new gopi(5,6,7);
    gopi obj1=new gopi();
    System.out.println(obj1.age);   
    System.out.println(obj.age+" "+obj.rollno+" "+obj.phone);  
    }
}
