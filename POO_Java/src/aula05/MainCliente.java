package aula05;

public class Main {
    public static void main(String[] args) {

        Cliente clienteDiana = new Cliente(1, "Diana");
        Cliente clienteEverton = new Cliente(2, "Everton");

        clienteDiana.setDivida(500.00); //setamos a divida para 500 onde ele será atribuido a variavel private Double divida; usando o metodo set na classe Cliente
        clienteDiana.aumentarDivida(10.00);/*Chamamos o metodo aumentarDivida onde:
         o paramentro Double valor recebeu 10, this.divida recebeu os 500 que ja possuia mais 10 e exibiu a fraze com o valor total da divida, 510.*/

        clienteEverton.setDivida(10000.00);//setamos a divida no valor 10000.00 onde ele será atribuido a variavel private Double divida; usando o metodo set na classe Cliente
        clienteEverton.pagarDivida(3000.00);/*Chamamos o metodo pagarDivida onde:
        o paramentro Double valor recebeu 300.00,this.divida recebeu os 10000.00 que ja possuia menos 3000.00 e exibiu a fraze com o valor total da divida, 7000.00.*/

    }
    //video aula 05 aos 55 minutos

}
