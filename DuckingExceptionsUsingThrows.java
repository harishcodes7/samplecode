class ducking{
    public void show() throws ClassNotFoundException{                                              // 👉 Since show() does not handle the exception inside itself (no try-catch inside show()), it must declare throws ClassNotFoundException.



        Class.forName("fire");


    }
}

public class DuckingExceptionsUsingThrows {
    /*static{
        System.out.println("Class Loaded");
    }*/
    public static void main(String[] args) {
        ducking obj = new ducking();

        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
