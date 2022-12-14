package aula03;

import java.util.Scanner;
        /* Faça um programa Java que solicite ao usuário o seu nome e sobrenome separadamente,
        * e a sua data de nascimento. Para a data solicite que o usuário digite três valores
        * que representam o dia, mês e ano. Alem disso, a partir das variaveis do nome e
        * sobrenome obtenha em uma terceira as inciais do usuário. Em seguida, exiba uma men-
        * sagem, com seu nome, as inicais do seu nome e sobrenome e sua data de nascimento
        * no formato dd/mm/aaaa. Utilize uma função que retorne as iniciais do nome.
        *
        *solicite ao usuário usa-se o scanner
        *cada dado solicitado é uma variavel: nome, sobrenome, data de nasc...
        * Não devemos esquecer de criar e usar a função solicitada
        * System.out.println("Informe o sexo: F - feminino / M - masculin");
        sexo = scanner.next().charAt(0);//charAt(0)
        * */

public class ExercicioUm {

    public static void main(String[] args) {

        String nome;
        String sobrenome;
        Integer diaNasc;
        Integer mesNasc;
        Integer anoNasc;
        String iniciaisNomeSobrenome;



        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe seu primeiro nome: ");//Exibe a frase na tela
        nome = scanner.next();//Recupera a String digitada no console.
        System.out.println("Informe seu sobrenome: ");//Exibe a frase na tela
        sobrenome = scanner.next();//Recupera a String digitada no console.
        System.out.println("Informe o dia do seu nascimento: ");//Exibe a frase na tela
        diaNasc = scanner.nextInt();//Recupera Integer digitado no console.
        System.out.println("Informe o mês do seu nascimento: ");//Exibe a frase na tela
        mesNasc = scanner.nextInt();//Recupera Integer digitado no console.
        System.out.println("Informe o ano do seu nascimento: ");//Exibe a frase na tela
        anoNasc = scanner.nextInt();//Recupera Integer digitado no console.


        System.out.printf("Ola " + nome + " " + sobrenome + ", nascido(a) em : " +diaNasc+ "/" +mesNasc+ "/" +anoNasc);

    }

}
