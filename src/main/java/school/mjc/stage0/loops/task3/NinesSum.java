package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int multiplier = 1;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int number = createNumber(i);
            sum += number;
        }

        System.out.println(sum);
    }

    private int createNumber(int length) {
        int number = 0;

        for (int i = 0; i < length; i++) {
            number = number * 10 + 9;
        }

        return number;
    }
}

