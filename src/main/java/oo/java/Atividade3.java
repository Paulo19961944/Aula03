/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oo.java;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido;
        int numeroSorteado;
            System.out.print("\nDigite um número de 1 a 100: ");
            numeroEscolhido = scanner.nextInt();
            numeroSorteado = (int)(Math.random()* 101);
        while(numeroEscolhido != numeroSorteado){
            System.out.println("\nO número sorteado foi: " + numeroSorteado + "\nO seu número é: " + numeroEscolhido);
            System.out.print("\nDigite outro número: ");
            numeroEscolhido = scanner.nextInt();
            numeroSorteado = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Parabéns !!! O Seu numero é: " + numeroEscolhido + " e o numero sorteado é: " + numeroSorteado);
    }
}
