import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int fistNumber = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();


        try {
            counter(fistNumber, secondNumber);
        } catch (Exception e) {
            System.out.print("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void counter(int firstNumber, int secondNumber) throws InvalidParamsException {
        if (firstNumber >= secondNumber) {
            throw new InvalidParamsException();
        }

        for (int i = 1; i <= secondNumber - firstNumber ; i++) {
            System.out.println("Imprimindo " + i);
        }
    }

}