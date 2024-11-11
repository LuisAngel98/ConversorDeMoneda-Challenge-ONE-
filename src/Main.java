import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option, amount;
        do {
            System.out.println("**************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar =>> Nuevo Sol Peruano");
            System.out.println("2) Nuevo Sol Peruano =>> Dólar");
            System.out.println("3) Euro =>> Nuevo Sol Peruano");
            System.out.println("4) Nuevo Sol Peruano =>> Euro");
            System.out.println("5) Euro =>> Peso Argentino");
            System.out.println("6) Peso Argentino =>> Euro");
            System.out.println("7) Salir");
            System.out.println("**************************************************");
            option = scanner.nextInt();
            if (option >= 1 && option <= 6) {
                System.out.print("Ingresa el valor que deseas convertir: ");
                amount = scanner.nextInt();

                double result = switch (option) {
                    case 1 -> ExchangeCalculator.CurrencyConverter("USD", "PEN", amount);
                    case 2 -> ExchangeCalculator.CurrencyConverter("PEN", "USD", amount);
                    case 3 -> ExchangeCalculator.CurrencyConverter("EUR", "PEN", amount);
                    case 4 -> ExchangeCalculator.CurrencyConverter("PEN", "EUR", amount);
                    case 5 -> ExchangeCalculator.CurrencyConverter("EUR", "ARS", amount);
                    case 6 -> ExchangeCalculator.CurrencyConverter("ARS", "EUR", amount);
                    default -> 0;
                };

                System.out.println("El resultado de la conversión es: " + result);
            } else if (option == 7) {
                System.out.println("Saliendo del conversor de moneda. ¡Hasta luego!");
                System.exit(0);
            } else {
                System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 0);
        scanner.close();
    }
}