package mainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Програма для підрахунку рейтингового балу
 * @author overpathz
 *
 */

public class RatePoint {
    private static final Scanner scanner = new Scanner(System.in);

    private List<String> disciplines = new ArrayList<>();
    private List<Integer> coefficients = new ArrayList<>();
    private List<Double> points = new ArrayList<>();
    private int disciplineCount;
    private double ratePoint;

    public RatePoint(Integer disciplineCount) {
        this.disciplineCount = disciplineCount;
    }

    public void inputData() {
        for (int i = 0; i < disciplineCount; i++) {
            System.out.print("Введіть дисципліну: ");
            disciplines.add(scanner.next());

            System.out.print("Введіть коефіцієнт: ");
            coefficients.add(scanner.nextInt());

            System.out.print("Введіть бал: ");
            points.add(scanner.nextDouble());

            System.out.println("");
        }
    }

    public void findRatePoint() {
        for (int i = 0; i < disciplines.size(); i++) {
            ratePoint += points.get(i) * coefficients.get(i);
        }

        ratePoint = 0.95 * (ratePoint/coefficients.stream().reduce(Integer::sum).get()) + 0.05;
    }

    public List<String> getDisciplines() {
        return disciplines;
    }

    public List<Integer> getCoefficients() {
        return coefficients;
    }

    public List<Double> getPoints() {
        return points;
    }

    public Double getRatePoint() {
        return ratePoint;
    }

    public void setDisciplineCount(int disciplineCount) {
        this.disciplineCount = disciplineCount;
    }

    @Override
    public String toString() {
        return "[Рейтинговий бал]: " + ratePoint;
    }
}
