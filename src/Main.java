import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println(12+45);
        int a = 12;
        int b = 45;
        System.out.println(a + b + " wynik");
        System.out.println("wynik" + a + b );
        System.out.println(b / a);
        System.out.println((double)b/a);

        Scanner scanner = new Scanner(System.in);

        System.out.println((int) b/a);

        System.out.println("Podaj pierwszą liczbę");
        double number1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę");
        double number2 = scanner.nextDouble();

        double result = number1 * number2;
        System.out.println("Wynik mnożenia to:" + result);
        System.out.printf("Wynik mnożenia to: %f i liczby %f to: %.2f/n", number1,number2, result);

        System.out.println("Wynik mnożenia " + number1 + "i liczby"
        + number2 + "to:" + result);

        String str = "Ala ma kota";
        boolean isTrue = false;
        System.out.printf("Tekst to: %S - to jest: %b", str, isTrue);
    }
}