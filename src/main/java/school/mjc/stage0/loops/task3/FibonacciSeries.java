package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i < lastFibonacci; i++) {
            int nextFibonacci = num1 + num2;
            System.out.println(nextFibonacci);

            num1 = num2;
            num2 = nextFibonacci;
        }
    }
}
