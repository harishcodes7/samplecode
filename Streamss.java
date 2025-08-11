import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamss {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8, 7, 5, 3, 2);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter (n -> n%2==0);
        Stream<Integer> s3 = s2.map( n-> n*2);
        int result = s3.reduce(0,(c,e) ->c+e);
    }
}
