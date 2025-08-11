class Counterr{
    int count;
    public synchronized void  increement(){
        count++;
    }
}
public class RaceCondition   {                                             //threads and mutation cannot be done if it need to be done only way is by thread safe bu using synchronised and join()
    public static void main(String[] args)throws InterruptedException {
        Counterr c = new Counterr();

        Runnable obj1 = () ->
        {
            for (int i = 0; i < 1000; i++) {
                c.increement();

            }

        };
        Runnable obj2 = () ->
        {
            for (int i = 0; i < 1000; i++) {
                c.increement();

            }

        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

            t1.join();
            t2.join();


        System.out.println(c.count);
    }

}
