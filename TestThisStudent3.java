class Student{
int rollno;
String name;
float fee;
Student(int r,String n,float f){
rollno=r;
name=n;
fee=f;
}
void display(){
System.out.println(rollno+"  "+name+"  "+fee);
}
}
class TestThisStudent3{
public static void main(String args[]){
Student s1=new Student(111,"A",10000);
Student s2=new Student(222,"P",10000);
s1.display();
s2.display();
}}
