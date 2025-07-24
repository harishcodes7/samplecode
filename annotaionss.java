class AA{
    public void showthedatabasebelongstothisclass(){
        System.out.println("in AA show");
    }
}
class BB extends AA{
    @Override
    public void showthedatabasebelongstothisclass(){                       // override anotaions helps to compare both the methods and ll get it
        System.out.println("in BB show");
    }
}
public class annotaionss {
    public static void main(String[] args) {
        BB obj = new BB();
        obj.showthedatabasebelongstothisclass();
    }
}
