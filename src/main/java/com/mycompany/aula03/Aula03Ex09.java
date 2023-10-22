package com.mycompany.aula03;

public class Aula03Ex09 {
    public static void main(String[] args) {
        // Continue
        int num = 0;
        while(num <10){
            ++num;
            if (num == 5){
                System.out.println("Num é igual a " + num);
                continue;
            }
            System.out.println("O Valor de num é igual a " + num);
        }
    }
}