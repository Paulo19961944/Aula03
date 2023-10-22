package oo.java; // Importa o Pacote
import java.util.Scanner;// Importa a Classe Scanner

public class Aula3ex1 {
    public static void main(String[] args) {
        // SWITCH CASE
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------- SWITCH CASE ---------\n"); // Título
        System.out.print("Digite um Horario: ");
        int hora = sc.nextInt();
        System.out.println();
        switch (hora) {
            case 1 -> System.out.println("01:00");
            case 2 -> System.out.println("02:00");
            case 3 -> System.out.println("03:00");
            case 4 -> System.out.println("04:00");
            case 5 -> System.out.println("05:00");
            case 6 -> System.out.println("06:00");
            case 7 -> System.out.println("07:00");
            case 8 -> System.out.println("08:00");
            case 9 -> System.out.println("09:00");
            case 10 -> System.out.println("10:00");
            case 11 -> System.out.println("11:00");
            case 12 -> System.out.println("12:00");
            case 13 -> System.out.println("13:00");
            case 14 -> System.out.println("14:00");
            case 15 -> System.out.println("15:00");
            case 16 -> System.out.println("16:00");
            case 17 -> System.out.println("17:00");
            case 18 -> System.out.println("18:00");
            case 19 -> System.out.println("19:00");
            case 20 -> System.out.println("20:00");
            case 21 -> System.out.println("21:00");
            case 22 -> System.out.println("22:00");
            case 23 -> System.out.println("23:00");
            case 24 -> System.out.println("00:00");
            default -> System.out.println("Digite um número válido !!!");
        }
        System.out.println("\n---------- FIM ----------");
    }
}