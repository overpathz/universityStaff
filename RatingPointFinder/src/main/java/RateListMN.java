import java.util.HashMap;
import java.util.Map;

public class RateListMN {
    public static void main(String[] args) {
        Map<String, Double> rating_list = new HashMap<>();
        rating_list.put("1", 85.9);
        rating_list.put("2", 82.1);
        rating_list.put("3", 70.5);

        rating_list.entrySet().stream().forEach(x-> System.out.println(x.getKey() + " " + x.getValue()));;
    }
}
