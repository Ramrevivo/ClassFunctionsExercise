import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = scanner.nextInt();
        System.out.println("is the number primary? " + isPrimary(num));
    }

    public static boolean isPrimary(int num) {
        boolean primary = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primary= false;
                break;
            }
        }
        return primary;
    }
}
