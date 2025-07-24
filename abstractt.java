// abstract and concrete class
abstract class Car{
    public abstract void fly();
    public abstract void drive();
    public void playmusic(){
        System.out.println("Playing..");
    }
}
abstract class WagonR extends Car{

    public void drive(){
        System.out.println("Driving");
    }
}
class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("flying");
    }
}
public class abstractt {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
