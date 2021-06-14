import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRate {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> disciplines = new ArrayList<>(List.of("Англійська", "Фізика", "Вишка", "Метрологія", "Прога", "Укра"));
        List<Integer> coefficients = new ArrayList<>(List.of(3, 6, 6, 6, 6, 3));
        List<Double> point = new ArrayList<>();

        for (int i = 0; i < disciplines.size(); i++) {
            System.out.print("Введіть бал з <" + disciplines.get(i) + ">: ");
            point.add(scanner.nextDouble());
        }

        double ratePoint = 0;

        for (int i = 0; i < disciplines.size(); i++) {
            ratePoint += point.get(i) * coefficients.get(i);
        }

        ratePoint /= coefficients.stream().reduce(Integer::sum).get();

        System.out.println("\nВаш рейтинговий бал: " + ratePoint);

    }
}
