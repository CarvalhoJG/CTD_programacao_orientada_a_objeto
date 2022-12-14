package aula03;

import java.util.Scanner;

public class ExercicioNumeroPrimo {

    public static boolean eDivisivel(int n, int divisor) {
        return n%divisor==0;
    }

    /* primeira etapa do exercício, não existe uma solução única. Este é o mais simples */

    public static boolean ePrimo(int n) {
        // Definimos uma variável quantidade para descobrir se o número pode ser dividido por
        // outros, além de 1 e ele mesmo
        int quantidade = 0; //contador

        //O i será os números divisores e o n o valor recebido
        for (int i = 1; i <= n; i++) { //para: o valor de i=1 for menor ou igual o numero informado

            /* Aqui utilizamos a função que retorna o módulo, ou seja, ela vai
             Tentar dividir por outros, até achar o valor igual ao digitado,
             ou seja, se eu digitar 25 ele vai tentando dividir até chegar no 25, ai ele para
             se ele sobrar mais que zero ele continua
             colocando valores na quantidade */

            if (eDivisivel(n, i)) { //divide o numero informado por 1, se o resto for 0. Tentará dividir todos os numeros de 1 até o valor informado na variável
                quantidade++; //acrescenta um no contador
            }
        }
        if (quantidade == 2) { //se a quantidade = 2 quer dizer que entrou no for acima somente duas vezes, significa que conseguiu dividir por 1 somente e por ele mesmo
            return true;
        } else {
            return false;
        }
    }

    /*Essa parte é como se usa a função, também pode haver mais de uma versão correta */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Insira o número: ");
        num=scanner.nextInt();
        if (ePrimo(num)) {
            System.out.println("Esse número é primo");
        }else {
            System.out.println("Esse número não é primo");
        }
    }

}
