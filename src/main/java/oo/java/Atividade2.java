package oo.java;
import java.util.Scanner;

public class Atividade2{
    public static void main(String[] args) {
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        int numero = sc.nextInt();
        System.out.println();

        for(int i = 1; i <=10; i++){
             resultado = numero * i;
            System.out.println("O Resultado de " +  numero + " x " + i + " = " +  resultado);
        }
    }
}