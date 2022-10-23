package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public static void main(String[] args) {

        calculateSum(1111);

    }
    public static void calculateSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
