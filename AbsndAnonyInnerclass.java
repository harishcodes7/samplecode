abstract class M{
    public abstract void show();
    public abstract void config();
}
//class N extends M {
//    public void show(){
//        System.out.println("In A show");
//    }
//}
public class AbsndAnonyInnerclass {
    public static void main(String[] args) {
        M obj = new M()
        {
            public void show(){
                System.out.println("In a new show");
            }
            public void config(){
                System.out.println("in a config");
            }
        };
        obj.show();
        obj.config();

    }
}
