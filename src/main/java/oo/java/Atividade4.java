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
public class Atividade4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        int numero = scanner.nextInt();
        System.out.println();
        
        while(numero >=0){
            System.out.println("O número é: " + numero);
            numero --;
        }
    }
}
