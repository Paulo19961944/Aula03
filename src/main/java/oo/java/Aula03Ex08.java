package oo.java;

public class Aula03Ex08 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; ++i) {
            if (i == 6) {
                System.out.println("Valor de i = " + i);
                break;
            }
            System.out.println("Próxima linha apos o loop...");
        }
    }
}