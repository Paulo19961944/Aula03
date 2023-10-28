package oo.java; // Importa o Pacote oo.java
import java.util.Scanner; // Importa a Classe Scanner
import java.util.Random; // Importa a Classe Random

public class AdvinhaNumeroWhile {
    // Método Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instancia a Classe Scanner
        Random random = new Random(); // Instancia a Classe Random
        int palpite; // Variável Palpite
        int tentativas = 0; // Variável Tentativas inicializada em 0
        int numero = random.nextInt(100)+1; // Captura o Número e Adiciona o Random
        System.out.println("\nSua sorte será lançada! Para conseguir sair da aula, \nvocê precisa descobrir um número de 0 a 100. Que comecem os jogos!\nVocê tem 5 chances."); // Printa o início da Mensagem na Tela

        // É verdadeiro quando Tentativas for menor ou igual a 5
        while(tentativas <=5){
            System.out.print("\nDigite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            // É verdadeiro quando Tentativas for menor ou igual a 5 e palpite for menor que número
            if(tentativas < 5 && palpite < numero){
                System.out.println("Tente um numero maior... ");

                // É verdadeiro quando Tentativas for menor ou igual a 5 e palpite for maior que número
            }   else if (tentativas < 5 && palpite > numero) {
                System.out.println("Tente um numero menor... ");

                // É verdadeiro quando Tentativas for igual a 5
            }   else if(tentativas ==5) {
                System.out.println("Você foi condenado a ficar na sala pelo resto de seus dias."  + " E o numero é: " + numero);
                break;
            }
            // Se nenhuma das condições for atendidas
            else {
                System.out.println("Após " + tentativas + " tentativas você concluiu o objetivo."  + " E o numero é: " + numero);
                break;
            }
        }
    }
}
