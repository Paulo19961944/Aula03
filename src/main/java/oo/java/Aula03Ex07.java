package oo.java;

public class Aula03Ex07 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("\n---------- FOR SEM INCREMENTO OU DECREMENTO ----------\n");
        for(int y = 1; x!=1; System.out.println("Aqui não tem Incremento")){
            x = x - y ;
        }
        System.out.println("\n---------- FIM ----------");
    }
}