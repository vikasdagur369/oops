public class Polymorphism {
    public static void main(String[] args) {
       B  obj = new B();
        obj.show(1);
    }
}
class A{
    void show (){
        System.out.println("A");
    }
}
class B extends A{
    void show (int a){
        System.out.println("B");
    }
}
