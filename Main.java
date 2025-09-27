import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer A y B
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Evaluar A
        if (A < 0) {
            System.out.println("A negative");
        } else {
            System.out.println("A positive");
        }
        
        // Evaluar B
        if (B < 0) {
            System.out.println("B negative");
        } else {
            System.out.println("B positive");
        }
    }
}