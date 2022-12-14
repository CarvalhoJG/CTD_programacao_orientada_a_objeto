package aula01;

import java.util.Scanner;

public class ExemploScannerVariavel {
    /*Crie um programa que solicite ao usuário seu nome, sexo
     * departamento, numero de registro, salario e se é CLT.
     * O programa deve exibir esses dados, caso não seja CLT
     * exibir PJ.
     *
     * Sempre que o exercicio informar que o valor deve
     * ser pedido ao usuário usáremos a classe Scanner*/

    public static void main(String[] args) {

        String nome;
        char sexo;
        String departamento;
        Integer numRegistro;
        Double salario;
        boolean isClt;

        Scanner scanner = new Scanner(System.in); //cria um scanner para recuperar os dados digitados pelo usuário
        System.out.println("Informe um nome: "); // exibe a frase na tela
        nome = scanner.next(); // ou nextLine() recupera a String digitada no console
        System.out.println("Informe um sexo: F - feminino / M - Masculino");
        sexo = scanner.next().charAt(0); //Desafio: como resolver essa situação: sugestão recuperar somente a primeira letra de uma String ou um char
        System.out.println("Qual o departamento? ");
        departamento = scanner.next();
        System.out.println("Qual seu número de registro: ");
        numRegistro = scanner.nextInt();
        System.out.println("Qual o salário: ");
        salario = scanner.nextDouble();
        System.out.println("Você trabalha em regime de CLT? true - sim / false - não");
        isClt = scanner.nextBoolean();

        String regimeTrabalhista = "PJ";

        if(isClt){
            regimeTrabalhista = "CLT";
        }

        System.out.println("O colaborador (a) " + nome +
                " sexo: " + sexo +
                " de registro n° " + numRegistro +
                " departamento " + departamento +
                " recebe mensalmente R$" + salario +
                " trabalha no regime " + regimeTrabalhista);
    }
}
