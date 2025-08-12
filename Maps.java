import java.util.HashMap;                                        // map is an key value pairs(k,v)
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("harish", 87);
        students.put("aris", 85);
        students.put("dhivya", 97);
        students.put("kamal", 78);
        System.out.println(students.keySet());
        for(String keys : students.keySet()){
            System.out.println(keys +":" + students.get(keys));
        }


    }
}
