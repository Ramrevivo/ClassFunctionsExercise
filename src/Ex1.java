import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter three different numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        biggestNumber(num1, num2, num3);
    }
    public static void biggestNumber(int i, int j, int w) {
        if (i > j){
            if (i > w){
                System.out.println("the biggest number is: " + i);
            }
        }
        if (j > i){
            if (j > w){
                System.out.println("the biggest number is: " + j);
            }
        }
        if (w>i){
            if (w>j){
                System.out.println("the biggest number is: " + w);
            }
        }
    }
}

