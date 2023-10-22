/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.java;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Atividade5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- CALCULADORA ----------\n");
        System.out.print("\nSe Deseja Multiplicação, digite 1. Se Deseja Divisão digite 2. Se Deseja Adição digite 3. Se deseja Subtração, digite 4: ");
        int operator = scanner.nextInt();
        System.out.print("\nDigite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o Segundo número: ");
        int num2 = scanner.nextInt();
        int resultado;
       
        switch(operator){
            case 1 -> { 
                resultado = num1 * num2;
                System.out.println("\nO Resultado é: " + resultado);
            }
            case 2 -> {
                resultado = num1 / num2;
                System.out.println("\nO Resultado é: " + resultado);
            }
            case 3 -> {
                resultado = num1 + num2;
                System.out.println("\nO Resultado é: " + resultado);
            }
            case 4 -> {
                resultado = num1 - num2;
                System.out.println("\nO Resultado é: " + resultado);
            }default -> System.out.print("\nDigite uma opção válida");
        }
    }
}
