package com.mycompany.aula03;

public class Cadastro {
    public static void main(String[] args) {
        Pessoa homem;
        homem = new Pessoa();
        homem.nome = "João";
        homem.sexo = 'm';
        homem.cabelo = "Castanhos";
        homem.idade = 18;
        System.out.println(homem.nome + " tem Cabelos " + homem.cabelo);

        Pessoa mulher;
        mulher = new Pessoa();
        mulher.nome = "Maria";
        mulher.sexo = 'f';
        mulher.cabelo = "Castanhos";
        mulher.idade = 31;
        System.out.println(mulher.nome + " tem Cabelos " + mulher.cabelo);
    }
}