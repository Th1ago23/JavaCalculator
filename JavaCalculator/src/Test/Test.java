package Test;
import Models.Calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean prossiga = true;
        do {
            System.out.println("Calculator");
            System.out.println("Entre com a altura: ");
            int altura = leitor.nextInt();

            System.out.println("Entre com a largura: ");
            int largura = leitor.nextInt();

            Calculator calculator = new Calculator(altura, largura);

            System.out.println("""
                    1- Calcular Perimetro
                    2- Calcular Area
                    """);

            int indice = leitor.nextInt();


            if (indice == 1) {
                System.out.println("O perimetro é: " + calculator.calcularPerimetro() + "\n");
            } else if (indice == 2) {
                System.out.println("A área é: " + calculator.calcularArea() + "\n");
            } else {
                System.out.println("Opção inválida \n");
                prossiga = false;
            }


        } while (prossiga);
    }
}
