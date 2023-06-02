package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = calculateDigitsSum(number);
        System.out.println(Math.abs(sum));
    }

    private int calculateDigitsSum(int number) {
        int sum = 0;
        String numberString = number + "";

        for (int id = 0; id < numberString.length(); id++) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
