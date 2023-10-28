package oo.java;
import java.util.Scanner;
import java.util.Random;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt();
        int tentativas = 0;
        int palpite;
        System.out.println("Sua sorte será lançada! Para conseguir sair da aula, você precisa decobrir um número de 0 a 100. Que comecem os jogos!");
        do{
            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite < numero){
                System.out.println("Tente um número maior...");
            } else if (palpite > numero){
                System.out.println("Tente um número menor...");
            } else {
                System.out.println("Após " + tentativas +" Você venceu e está livre!");  
            }
        } while (palpite != numero);
    }
}
