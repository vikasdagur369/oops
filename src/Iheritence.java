public class Iheritence {

    public static void main(String[] args) {
    add obj = new add();

    new Hello().print();
}

}
class add{
    int a, b;
    public void setValue(int n1, int n2){
        this.a = n1;
        this.b = n2;
    }

    void sum(){
        int result = a+b;
        System.out.println(result);
    }

}
class Hello {
    public Hello() {
        System.out.println("in constructor ");

    }
    public void print(){
        System.out.println("in print");
    }
}
