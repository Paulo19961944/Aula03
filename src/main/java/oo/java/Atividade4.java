package oo.java;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número positivo para contar a Contagem Regressiva: ");
        int numero = scanner.nextInt();
        System.out.println();
        while(numero >=0) {
            System.out.println("O número é: " + numero);
            numero -= 1;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
