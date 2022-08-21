import java.util.Scanner;

public class friendsNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Your number 2: ");
        int number2 = scanner.nextInt();

        int number1_total = 0;
        int number2_total = 0;

        for (int i = 1; i < number1 ; i++) {
            if (number1 % i == 0){
                number1_total += i;
            }
        }
        for (int i = 1; i < number2 ; i++) {
            if (number2 % i == 0){
                number2_total += i;
            }
        }

        if (number2 == number1_total && number1 == number2_total){
            System.out.println(number1 + " and " + number2 + " are friends number");
        }
        else
            System.out.println(number1 + " and " + number2 + " are not friends number");
    }
}
