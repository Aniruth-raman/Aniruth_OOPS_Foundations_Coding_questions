import java.util.Arrays;
import java.util.Scanner;

public class largestNumber {
    static String returnLargestNumber(long[] input) {
        Arrays.sort(input);
        String largeValue = "" + input[input.length - 1];
        for (int i = input.length - 2; i >= 0; i--) {
            String num1 = "" + input[i] + largeValue;
            String num2 = "" + largeValue + input[i];
            largeValue = Long.parseLong(num1) >= Long.parseLong(num2) ? num1 : num2;
        }
        return largeValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers separated by spaces:");
        String[] s = in.nextLine().split(" ");
        in.close();
        long[] input = Arrays.stream(s)
                .mapToLong(Long::parseLong)
                .toArray();
        System.out.println(returnLargestNumber(input));
    }
}
