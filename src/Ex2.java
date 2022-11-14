import java.util.Scanner;

public class Ex2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers: ");
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double num3 = scanner.nextInt();
        calculateAvarage(num1, num2, num3);
    }

    public static void calculateAvarage(double i, double j, double w){
       double avg = (i + j + w)/3;
       System.out.println("this is the avarage of your numbers: " + avg);
    }
}
