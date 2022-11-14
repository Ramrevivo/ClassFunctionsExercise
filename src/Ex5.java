import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("are you numbers pythagorian? " + isPythagorian(a,b,c));

    }
    public static boolean isPythagorian(double a, double b, double c){
        boolean pythagorian;
        if ((a*a + b*b) == c*c){
            pythagorian = true;
        }
        else{
            pythagorian = false;
        }
        return pythagorian;
    }
}
