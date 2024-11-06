public class Abstract {
    public static void main(String[] args) {
        Name x =new printName();
        x.show();
    }
}

 abstract class Name{
    abstract void show();


}
class printName extends Name{
    void show(){
        System.out.println("vikas dagur");
    }
}
