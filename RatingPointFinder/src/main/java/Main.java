import mainApp.RatePoint;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RatePoint ratePoint = new RatePoint(6);
        ratePoint.inputData();
        ratePoint.findRatePoint();
        System.out.println(ratePoint);;
    }
}
