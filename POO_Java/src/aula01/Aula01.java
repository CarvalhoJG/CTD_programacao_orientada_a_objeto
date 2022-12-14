package aula01;

public class Aula01 {
    /*
     *  1 - Classes sempre inicia com letras maiuscula, nome do projeto e nome de pacote tudo minuisculo. Usamos sempre camelCase para facilitar a leiturta do codigo
     *  2 - Java é uma linguagem que pode ser usada para diversos fins, linguagem de dados geral.
     *  3 - Java é uma libguafem de alto nivel por estar mais proximo de uma linguagem humana, pois é mais fácil de escrever, ler e manter por humanos,
     *  menos linhas de código, codigo executável em diferentes tipos de máquinas e sistema operacionais.
     *  4 - Java é fortemente tipada, exige a declaração de váriavel e ela permanece com mesmo dado ate o final da execução.
     *  5 - Java é uma linguagem compilada e interpretada: o programa pode ser complicado e executavel em qualquer plataforma desde que tenha o interpretador
     *  6 - O java utiliza as variaveis que utilizam um espaço na memoria para realizar o processamento dos dados. Um programa é basedo no processamento de dados,
     *  para utilizar esses dados usamos a memoria. O espaço de memória usado para armazenar valores e permitem operções de diversos tipos
     *  7 - Método main: É usado pela JVM para executar a instrução de um programa feito. É o ponto de entarda do aplicativo, ao dar play a JVM vau procurar o metodo main.
     *  8 - O java utiliza as variaveis que utilizam um espaço na memoria para realizar o processamento dos dados.
     *
     */

    //CTRL + s Para salvar
    //SHIFT ALT i Para indentar
    //SOUT + TAB Para se autocompleta.

    /*Operadores matematicos
     * Para SOMA usamos o +
     * Para SUBTRAÇÃO usamos -
     * Para DIVISÃO usamos /
     * Para MULTIPLICAÇÃo usamos *
     * Para MODULO usamos %
     * Para UNARIO soma 1 usamos ++
     * Para UNARIO subtrai 1 usamos --
     *
     * Operadores Lógicos
     * Para AND usamos && retorna verdadeiro de todas as avalições forem verdadeiras
     * Para OR usamos || retorna verdadeiro se uma das avaliações forem verdadeiras
     * Para NOT usamos ! retorna o oposto do resultado da avaliação.
     *
     * Operadores Relacionais
     * Para MAIOR usamos >
     * Para MENOR usamos <
     * Para IGAUL usamos == ou .equals()
     * Para MAIOR OU IGUAL usamos >=
     * Para MENOR OU IGUAL usamos <=
     * Para DIFERENTE usamos !=
     *
     *
     * */

    public static void main(String[] args) {

        System.out.println("Hello Word. Seja bem vindo!"); //Use a classe sistema e print uma saida para usuário com o out.

        String nome = "Diana";

        System.out.println(nome.toUpperCase());// O .toUpperCase converte e imprime todas as letras em maiusculo.

        //Se digitar main e precionar tab ele se autocompleta.

    }

}
