class Counter{
    int count;
    public synchronized void increement(){
        count++;
    }
}
public class Thread_nd_mutations {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for (int i = 1; i <=1000; i++) {
               c.increement();
            }

        };
        Runnable obj2 = () ->
        {
            for (int i = 1; i <= 1000; i++) {
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

