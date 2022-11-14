import java.util.Scanner;

public class Ex3 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = scanner.nextInt();
        System.out.println("is the number even? " + isEven(num));

    }
    public static boolean isEven(int i){
        boolean even = false;
        if (i % 2 == 0){
            even = true;
        }
        return even;
    }
}
