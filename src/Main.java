import java.util.Scanner;

public class Main {
    static double somar(double x, double y){
        return y + x;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = scan.nextDouble();

        System.out.println("O resultado é: " + somar(numero1,numero2));

    }
}