package aula03;

import java.util.Scanner;

    //Quando desejo isolar uma ação da minha classe que envolve atributos eu crio um metodo ou função

    /*Estrutura das funções:
     * Podem ou não conter modificador de acesso public, private ou protecter
     * A primeira coisa que coloco na funcão é o tipo de retorno:
     * tipo de retorno, nome parametros que vou usar para fazer o calculo generico onde os
     * valores são setados pelo petodo main.
     * Podemos usar o boolean, int.. isso define minha saída sera do tipo espeficicado.
     * Ou podemos trabalhar com void, que é quando não especifica o valor da saída, usado
     * quando ha muitas execuções a serem realizadas e por isso não se declara o tipo
     * Sempre que tenho um tipo diferente de Void preciso obrigatorimanente usar o return
     * com o msm tipo*/
    /**/

    public class ExemploFuncao {

        /*Defina dois numeros interios e atribua um valor a cada um.
         *Verifique se o primeiro numero é divisivel pelo segundo e indique
         * o resultado obtido por meio de uma mensagem.
         * Obs.: Ser divisivel significa que ao dividir precisa dar um valor
         * exato, ou seja, sem decimais.
         */

        Integer dividendo;
        Integer divisor;


        //tipo  nome        parametros que são alimentados pelo metrofo main
        static boolean eDivisivel(Integer dividendo, Integer divisor){//sempre que usar um tipo diferente de void,
            // devemos usar o return do msm tipo que foi declarado
            return dividendo%divisor == 0; /*se o resto da divisão do dividendo pelo divisor for
             *igual a zero, retorna true senão retorna false*/
        }

        //tipo  nome        parametros
        static void eDivisivelExemploDois(Integer dividendo, Integer divisor){
            if(dividendo%divisor==0 ){//Se o resto da divisão for igual a zero
                System.out.println("O numero " +dividendo+ " é divisivel por "
                        +divisor+".");;//se sim retona true, verdadeiro
            }else{//senão
                System.out.println("O numero " +dividendo+ " não é divisivel por "
                        +divisor+".");//retona false, false.
            }
        }
        /*
         * Para recuperar(manipular) os valores(dados) digitados pelo usuário usamos os parametros, passando
         * os valores por eles para que sejam usados dentro do metodo*/


        public static void main(String[] args) {
            //eDivisivelExemploDois(10,20); //Aqui usamos o exemplo dois eDivisivelExemploDois

            if(eDivisivel(20,10)){
                System.out.println("Os numeros são divisiveis.");
            }else{
                System.out.println("Os numeros não são divisiveis");
            }

            /*Aqui chamamos a funçõa eDivisivel e setamos os valores de numero 1 e numero 2.*/

            
        }
    }

