import java.util.Scanner;

public class PrintYourAgeFromInput05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");      //prima stampata
        int age = scanner.nextInt();                 //inserimento dato
        System.out.printf("Your age is: %d", age);   //risultato finale
    }
}
