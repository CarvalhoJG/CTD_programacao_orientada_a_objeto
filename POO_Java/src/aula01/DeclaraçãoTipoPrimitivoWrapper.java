package aula01;

public class DeclaraçãoTipoPrimitivoWrapper {
     /* Tipos primitivos
    byte
    short
    int
    long
    float
    double
    String
    char
    boolean
    Permite apenas armazenar um valor.

    Tipos Wraper
    Integer
    Float
    Double
    Alem de permitir armazenar um valor,
    possibilita utilizar funções/operações já definidas.
    Todas as classes WRAPPERS emglobam dentro de si seus
    respectivos tipos primitivos.*/

    char sexo = 'M';
    int mes = 12;
    float valorAgua = 109.99F;
    double saldoBanco = 1256985236.25;
    boolean eDia = true;

    String nome; //Variavel WRAPPER que recebe qualquer tipo de caracter
    Integer cpf; //Variavel WRAPPER que recebe numeros inteiros, null e possibilita funções ja definidas.
    Float peso; //Variavel WRAPPER que recebe numeros decimais, null e possibilita funções ja definidas.
    Double resultadoPi; //Variavel WRAPPER que recebe numeros decimais, null e possibilita funções ja definidas.
    Boolean maiorIdade; //Variavel WRAPPER que considera verdadeiro ou falso e possibilita funções ja definidas.

}
