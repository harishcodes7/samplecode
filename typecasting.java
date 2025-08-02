class D {
    public void show(){
        System.out.println("in A show");
    }
}
class E extends D{
    public void show1(){
        System.out.println("in B show");
    }
}

public class typecasting {
    public static void main(String[] args) {
        D obj = (D)new E();                          //upcasting aka typecasting
        obj.show();

        E obj1 =(E) obj;                             // downcasting by using ref obj of parent class hence this is downacsting
        obj1.show1();


    }
}
