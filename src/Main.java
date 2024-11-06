public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("vikas");
        System.out.println(s1.getName());
    }
}
 class Student {
     private String name;
     private int age;

     public void setName (String name) {
         this.name = name;
     }
     public String getName () {
         return name;
     }
}