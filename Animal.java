class Cat{
int size;

String name;
void bark(){
if(size>60){
System.out.println("Woof!Woof!");
}else if(size>14){
System.out.println("Ruff!Ruff!");
}else{
System.out.println("Yip!Yip!");
}

}
}
class DogTestDrive {
public static void main(String[] args){
Cat one = new Cat();
one.size = 70;
Cat two = new Cat();
two.size = 8;
Cat three =  new Cat();
three.size = 35;

one.bark();
two.bark();
three.bark();
}
}
