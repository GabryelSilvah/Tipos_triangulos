package br.com.servencode.calculararea;

public class Valores {

    static void tipoTriangulo(double l1, double l2, double l3){

        if (l1 == l2 && l2 ==l3){
            System.out.println("Triângulo Equilátero");
        }else if(l1 == l2 || l2 == l3 || l1 == l3){
            System.out.println("Triângulo Isósceles");
        }else if (l1 != l2 && l2 != l3){
            System.out.println("Triângulo Escaleno");
        }

    }
}
