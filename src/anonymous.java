public class anonymous {

    public static void main(String[] args) {

//        Example obj = new Example(){ //anonymous class
//
//            public void show() {
//                System.out.println("world");
//            }
//        };
        //obj.show(); // op is world

        new Example().show();
    }
}

class Example {
    public void show() {
        System.out.println("Hello");
    }
}

