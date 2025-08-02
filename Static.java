class Mobile{
    String brand;
    int price;
    static String name;
                                      // case 2 : with method itself
    public static void show1(Mobile obj)
    {                                                   //static method

        System.out.println(obj.brand + ":" +obj.price + ":" + name);
    }


}
public class Static {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "iphone";
        obj1.price = 1500 ;
        Mobile.name =  "smartphone";                             // static variable should be called with their class name not their obj name

        Mobile obj2 = new Mobile();
        obj2.brand = "sam";
        obj2.price = 1509 ;
        Mobile.name =  "smartphone";                                // ""                                       ""

        //Mobile.name = "phone";                                  //   ""                                      ""


        Mobile.show1(obj1);
        Mobile.show1(obj2);}


}
