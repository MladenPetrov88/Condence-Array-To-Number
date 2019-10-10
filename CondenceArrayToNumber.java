import java.util.Scanner;

public class CondenceArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int a = numbers.length;
        while (a > 1) {
            int[] condensed = new int[a - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = new int[condensed.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = condensed[i];
            }
            a -= 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
