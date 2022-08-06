import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    static int[] TwoSum_check(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            int n2 = target - num[i];
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] == n2) {
                    return new int[] { i, j };
                }

            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers separated by spaces:");
        String[] s = in.nextLine().split(" ");
        int[] num = Arrays.stream(s)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Enter the Target Variable:");
        int target = in.nextInt();
        in.close();
        System.out.println(Arrays.toString(TwoSum_check(num, target)));
    }
}
