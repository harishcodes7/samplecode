@FunctionalInterface                                    // fI MEANS CAN USE ONLY ON METHOD WITH ANONYMOUS INNER CLASS
interface R {
    void show(int i );
}
public class funcinterface {
    public static void main(String[] args) {
        R obj = (i) -> System.out.println("in a show" + " "+ i);           //-> LAMBDA EXPRESSION WHICH MAKES THE PROG MORE SIMPLIFIED
        obj.show(5);
    }
}
