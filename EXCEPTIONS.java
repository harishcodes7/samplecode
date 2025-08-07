public class EXCEPTIONS {
    public static void main(String[] args) {
        int i =2;
        int j = 0;                 // jst declaring it
        int nums[]=new int[4];
        String str = null;
        try
        {
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }
        catch (ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limit");
        }
        catch (Exception e) {
            System.out.println("smtg went wrong");              //nullpointerexception
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
