package br.com.servencode.calculararea;
import java.util.Scanner;
import java.lang.String;

public class Main extends Valores{
    static double lado1, lado2, lado3;
    static String novoTest;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


            System.out.println("Informe o valor do primeiro lado: ");
            lado1 = ler.nextDouble();
            System.out.println("Informe o valor do segundo lado: ");
            lado2 = ler.nextDouble();
            System.out.println("Informe o valor do terceiro lado: ");
            lado3 = ler.nextDouble();
            Valores.tipoTriangulo(lado1,lado2,lado3);

            Valores.area(lado1,lado2,lado3);
    }

}
