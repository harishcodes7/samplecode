//super and this in inheritance
class A extends Object{                                                 // every class in java extends object class

    public A() {
        super();                                                        //super is an deafult parameter is contructor
        System.out.println("is an A");
    }

    public A(int n) {
        super();
        System.out.println("is an int A");
    }
}

class B extends A{
        public B(){
            super(5 );                                                    //change values according to the needs
            System.out.println("is an B");
        }
        public B(int n){
            super();
            System.out.println("is an int B");
        }
}
public class superr {
    public static void main(String[] args) {
        B obj = new B();

    }
}
