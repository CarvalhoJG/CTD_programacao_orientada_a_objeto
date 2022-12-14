package aula03;

/*
 * Escreva uma função que receba três numeros e retorne o maior entre os três numeros.
 * Em seguida, faça um programa que permita a entrada de três valores pelo usuário,
 * use a função e exiba o resultado
 *  */

public class ExercicoDois {
    static void informaMaiorNumero(Integer numero1, Integer numero2, Integer numero3){
        Integer maiorNumero = numero1;
        if(numero2 > maiorNumero){
            maiorNumero = numero2;
        }
        if(numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
        System.out.println("O maior número é " + maiorNumero);
    }
    public static void main(String[] args) {
        informaMaiorNumero(20, 10, 15);
    }
}


