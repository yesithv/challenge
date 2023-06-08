package ironcoding.monnet;

public class Fibonacci {

    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        System.out.print(one + " " + two);
        int result = 0;
        int limit = 50;
        int count = 0;

        // All fibonacci numbres until one limit:
        while (result < limit) {
            result = one + two;
            System.out.print(" " + result);
            count++;
            one = two;
            two = result;
        }
        System.out.println(" Counter: " + count);

        // Find one simple index fibonacci number:
        System.out.println("Number [" + count + "]: " + fibonacci(count));

        // Know if a number is Fibonacci:
        int testNumber = 34;
        System.out.println(testNumber + " Es fibonaci ? " + isFibonacci(testNumber));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean isFibonacci(int number) {
        int previous = 0;
        int current = 1;
        while (current < number) {
            int temp = current;
            current = previous + current;
            previous = temp;
        }
        return current == number;
    }
}
