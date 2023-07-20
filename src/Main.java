import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int numeroDigitos = String.valueOf(numero).length();
        System.out.println("O numero possui " + numeroDigitos + " digitos");
        scanner.close();
    }
}