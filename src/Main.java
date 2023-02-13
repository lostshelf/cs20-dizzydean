import java.util.*;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static int ITERATIONS = 5;
    public static void main(String[] args) {
        System.out.print("How long is the bridge?: ");

        int length = Integer.parseInt(scan.nextLine().trim());

        int total = 0;
        for (int i = 0; i < ITERATIONS; i++)
            total += walkAcross(length);


        int average = total / ITERATIONS;

        System.out.println("On average, it took " + average + " steps to reach the end.");
    }
    static int walkAcross(int length) {
        int steps = 0;
        for (int i = 1; i <= length; i += rand.nextInt(2) == 0 ? -1 : 1) {
            steps++;
        }

        System.out.println(steps);

        return steps;
    }
}