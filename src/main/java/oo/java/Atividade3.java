package oo.java;
import java.util.Scanner;
import java.util.Random;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100)+1;
        int tentativas = 0;
        int palpite;
        System.out.println("\nSua sorte será lançada! Para conseguir sair da aula, \nvocê precisa descobrir um número de 0 a 100. Que comecem os jogos!\nVocê tem 5 chances.");
        do{
            System.out.print("\nDigite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (tentativas < 5 && palpite < numero){
                System.out.println("Tente um numero maior... ");
            } else if (tentativas < 5 && palpite > numero){
                System.out.println("Tente um numero menor...");
            } else if(tentativas ==5){
                System.out.println("Você foi condenado a ficar na sala pelo resto de seus dias!!!");
            } else{
                System.out.println("Após " + tentativas + " tentativas você concluiu o objetivo!!!");
            }
        } while (palpite != numero && tentativas <=5);
    }
}
