import java.util.Scanner;

public class xpowern {
    static int power(int x, int y) {
        int temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x = sc.nextInt();
        System.out.println("Enter the value for n");
        int n = sc.nextInt();
        sc.close();
        System.out.println(power(x, n));
    }
}
