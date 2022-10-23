package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public static void main(String[] args) {
        revert(489);
        revert(12345);
    }

    public static void revert(int number) {
        int reversedNum = 0;
        while (number > 0) {
            int modNumber = number % 10;
            reversedNum = reversedNum * 10 + modNumber;
            number = number / 10;
        }
        System.out.println(reversedNum);
    }
}
